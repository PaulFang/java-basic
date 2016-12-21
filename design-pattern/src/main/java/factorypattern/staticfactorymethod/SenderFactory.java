package factorypattern.staticfactorymethod;

public class SenderFactory {
	
	public static SmsSender produceSmsSender(){
		return new SmsSender();
	}
	
	public static MailSender produceMailSender(){
		return new MailSender();
	}

}
