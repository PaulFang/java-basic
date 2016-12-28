package factorypattern.multifactorymethod;

/**
 * factory provides method for each product creation
 *
 */
public class SenderFactory {
	
	public SmsSender produceSmsSender(){
		return new SmsSender();
	}
	
	public MailSender produceMailSender(){
		return new MailSender();
	}

}
