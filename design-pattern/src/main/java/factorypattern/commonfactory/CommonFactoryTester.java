package factorypattern.commonfactory;

public class CommonFactoryTester {

	public static void main(String[] args) {
		
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("MailSender");
		
		if(sender != null){
			sender.send();
		}

	}

}
