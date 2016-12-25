package observerpattern;

/**
 * JDK 自带 observer pattern 基础框架： <br>
 * http://blog.csdn.net/dcz1001/article/details/26090607
 *
 */
public class ObserverPatternTester {

	public static void main(String[] args) {
		
		Asubject aSubject = new Asubject();
		Xobserver xObserver = new Xobserver();
		Yobserver yObserver = new Yobserver();
		aSubject.add(xObserver);
		aSubject.add(yObserver);
		
		aSubject.operation();
		
	}

}
