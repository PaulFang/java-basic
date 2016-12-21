package abstractfactorypattern;

public class MailSenderFactory implements ISenderFactory {

	public Sender produce() {
		return new MailSender();
	}

}
