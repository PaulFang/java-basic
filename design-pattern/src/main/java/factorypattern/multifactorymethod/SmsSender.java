package factorypattern.multifactorymethod;

public class SmsSender implements Sender {

	public void send() {
		System.out.println("SMS sender is working");
	}

}
