package factorypattern.commonfactory;
/**
 * 缺点：
 * 工厂产品固定，仅能生产 SmsSender 和 MailSender。
 * 没新添加一个产品，都需要修改此类。
 * 依赖生产指令，指令出错即无法生产出产品
 *
 */
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
