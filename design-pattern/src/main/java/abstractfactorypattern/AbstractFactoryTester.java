package abstractfactorypattern;

public class AbstractFactoryTester {

	public static void main(String[] args) {
		
		// 随时可以新增工厂类，随时可以切换工厂
		ISenderFactory factory = new MailSenderFactory();
		Sender sender = factory.produce();
		sender.send();
	}

}
