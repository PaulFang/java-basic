package common.tools;

public class Test {
	
	// 赛软件 * 比赛  =  软件比拼
	public static void main(String[] args){
		
		int first;
		int second;
		int third;
		int fourth;
		int ninth;
		System.out.println("started ...");
		
		for(first = 1 ; first <10 ;first++){
			for(second = 1 ; second <10 ;second++){
				for(third = 1 ; third <10 ;third++){
					for(fourth = 1 ; fourth <10 ;fourth++){
						for(ninth = 0 ; ninth <10 ;ninth++){
							
							boolean f1 = first != second;
							boolean f2 = first != third;
							boolean f3 = first != fourth;
							boolean f4 = first != ninth;
							
							boolean f5 = second != third;
							boolean f6 = second != fourth;
							boolean f7 = second != ninth;
							
							boolean f8 = third != fourth;
							boolean f9 = third != ninth;
							
							boolean f10 = fourth != ninth;
							
							int a = 100*first + 10*second + third; 
							int b = 10*fourth + first;
							int result = 1000*second + 100*third + 10*fourth + ninth;
							
							if(f1 && f2 && f3 && f4 && f5 && f6 && f7 && f8 && f9 && f10 && (a*b == result)){
								System.out.println(a + " * " + b + " = " + result );
							}
						}
					}
				}
			}
		}
		System.out.println("ended ...");
	}

}
