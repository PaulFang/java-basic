package abstractfactorypattern;

public class SmsSender implements Sender {

	public void send() {
		System.out.println("SmsSender is working");
	}

}
