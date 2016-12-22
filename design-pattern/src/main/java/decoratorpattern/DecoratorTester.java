package decoratorpattern;

public class DecoratorTester {

	public static void main(String[] args) {
		
		Source source = new Source();
		Decorator decorator = new Decorator(source);
		decorator.method();
		
	}

}
