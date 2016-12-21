package factorypattern.commonfactory;

public class SenderFactory {
	
	public Sender produce(String senderName){
		
		if("SmsSender".equals(senderName)){
			return new SmsSender();
		}else if("MailSender".equals(senderName)){
			return new MailSender();
		}else{
			return null;
		}
		
	}

}
