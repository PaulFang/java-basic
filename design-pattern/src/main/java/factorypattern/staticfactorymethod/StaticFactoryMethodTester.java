package factorypattern.staticfactorymethod;

public class StaticFactoryMethodTester {

	public static void main(String[] args) {

		Sender sender = SenderFactory.produceMailSender();
		
		sender.send();
	}

}
