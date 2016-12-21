package factorypattern.commonfactory;

public class SmsSender implements Sender {

	public void send() {
		System.out.println("SMS sender is working");
	}

}
