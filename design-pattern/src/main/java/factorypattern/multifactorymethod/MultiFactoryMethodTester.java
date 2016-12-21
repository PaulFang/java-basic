package factorypattern.multifactorymethod;

public class MultiFactoryMethodTester {

	public static void main(String[] args) {

		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produceMailSender();
		
		sender.send();
	}

}
