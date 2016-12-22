package adapterpattern.interfacepattern;

/**
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，
 * 可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。 
 */
public class AdapterTester {

	public static void main(String[] args) {
		Wrapper wrapper1 = new SourceSub1();
		Wrapper wrapper2 = new SourceSub2();
		
		wrapper1.method1();
		wrapper1.method2();
		wrapper2.method1();
		wrapper2.method2();
		
	}

}
