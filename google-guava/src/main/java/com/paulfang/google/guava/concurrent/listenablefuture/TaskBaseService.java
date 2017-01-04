package com.paulfang.google.guava.concurrent.listenablefuture;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public abstract class TaskBaseService<P extends ItaskParameter, R extends ItaskResult> {

	private ListeningExecutorService executorService = MoreExecutors
			.listeningDecorator(Executors.newCachedThreadPool());

	public void doSyncService(List<P> taskParameters) {

		for (final P taskParameter : taskParameters) {

			final Callable<R> task = buildTask(taskParameter);

			final ListenableFuture<R> listenableFuture = executorService.submit(task);

			// approach 1 : add listener to the listenableFuture
			/*****
			 * listenableFuture.addListener(getTaskResultListener(),
			 * executorService);
			 ******/

			// approach 2 : add listener to the listenableFutre
			// this is the recommend approach !
			Futures.addCallback(listenableFuture, new FutureCallback<R>() {

				public void onSuccess(R r) {
					P p = taskParameter;
					handleSuccess(p, r);
				}

				public void onFailure(Throwable t) {
					P p = taskParameter;
					handleFailure(p, t);
				}
			});

		}
	}

	protected abstract Runnable getTaskResultListener();

	protected abstract void handleSuccess(P p, R r);

	protected abstract void handleFailure(P p, Throwable r);

	private Callable<R> buildTask(final P taskParameter) {

		return new Callable<R>() {

			public R call() throws Exception {
				R taskResult = getNewTaskResultObject();
				doBusiness(taskParameter, taskResult);
				return taskResult;
			}

		};
	}

	protected abstract R getNewTaskResultObject();

	protected abstract void doBusiness(final P taskParameter, final R taskResult) throws Exception;

	protected abstract TaskType getTaskType();

}
