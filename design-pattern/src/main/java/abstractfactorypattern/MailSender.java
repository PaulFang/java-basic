package abstractfactorypattern;

public class MailSender implements Sender {

	public void send() {
		System.out.println("MailSender is working");
	}

}
