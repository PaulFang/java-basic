package factorypattern.staticfactorymethod;

/*
 * factory provides static method for each product creation
 */
public class SenderFactory {
	
	public static SmsSender produceSmsSender(){
		return new SmsSender();
	}
	
	public static MailSender produceMailSender(){
		return new MailSender();
	}

}
