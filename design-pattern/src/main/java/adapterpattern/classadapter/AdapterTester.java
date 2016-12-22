package adapterpattern.classadapter;

/**
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，
 * 创建一个新类，继承原有的类，实现新的接口即可。
 */
public class AdapterTester {

	public static void main(String[] args) {
		
		Adapter adapter = new Adapter(); 
		
		adapter.method1();
		
		// Targetable接口的实现类通过继承 Source 类就具有了Source类的功能。
		adapter.method2();
	}

}
