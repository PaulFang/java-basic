package observerpattern;

public class Asubject extends AbstractSubject {
	
	public void operation() {
		System.out.println("Asubject updated status");
		this.notifyObservers();
	}
}
