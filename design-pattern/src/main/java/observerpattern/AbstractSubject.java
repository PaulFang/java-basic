package observerpattern;

import java.util.Vector;

public class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();  
	
	public void add(Observer observer) {
		vector.add(observer);
	}

	public void del(Observer observer) {
		vector.remove(observer);
	}

	public void notifyObservers() {
		for(Observer observer:vector){
			observer.update();
		}
	}

	public void operation() {}

}
