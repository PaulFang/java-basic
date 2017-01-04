package com.paulfang.google.guava.concurrent.listenablefuture;

import java.util.ArrayList;
import java.util.List;

public abstract class TaskBaseResult2 {

	private TaskType taskType;
	private List<Exception> exceptions;

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public List<Exception> getExceptions() {
		return exceptions;
	}

	public void setExceptions(Exception exception) {
		if(this.exceptions==null){
			this.exceptions = new ArrayList<Exception>();
		}
		this.getExceptions().add(exception);
	}

}
