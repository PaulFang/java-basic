package decoratorpattern;

public class Decorator implements Sourceable{
	
	private Source source;
	
	public Decorator(Source source){
		this.source = source;
	}

	public void method(){
		
		System.out.println("prepare for starting work");
		
		source.method();
		
		System.out.println("clean up for end working");
	}
	
}
