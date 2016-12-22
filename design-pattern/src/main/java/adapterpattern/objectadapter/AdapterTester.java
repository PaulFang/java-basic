package adapterpattern.objectadapter;

/**
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，
 * 可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 */
public class AdapterTester {

	public static void main(String[] args) {

		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		
		// wrapper 原本是接口 Targetable 的实现者
		// 现在却通过持有 Source 对象的方式，拥有 Source 类的功能方法
		wrapper.method1();
		
	}

}
