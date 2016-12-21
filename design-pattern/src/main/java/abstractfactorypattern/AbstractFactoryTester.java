package abstractfactorypattern;

public class AbstractFactoryTester {

	public static void main(String[] args) {
		
		ISenderFactory factory = new MailSenderFactory();
		Sender sender = factory.produce();
		sender.send();
	}

}
