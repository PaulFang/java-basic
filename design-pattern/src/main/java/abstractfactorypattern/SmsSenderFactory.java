package abstractfactorypattern;

public class SmsSenderFactory implements ISenderFactory {

	public Sender produce() {
		return new SmsSender();
	}

}
