package factorypattern.multifactorymethod;

public class SenderFactory {
	
	public SmsSender produceSmsSender(){
		return new SmsSender();
	}
	
	public MailSender produceMailSender(){
		return new MailSender();
	}

}
