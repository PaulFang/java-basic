package factorypattern.commonfactory;

public class MailSender implements Sender {

	public void send() {
		System.out.println("Mail sender is working");
	}

}
