package study2.lamda;

public class MyFunctionalInterfaceExample2 {
	public static void main(String[] args) {
		
		MyFunctionalInterface2 fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		
		// 매개값으로 5를 주면, 람다식의 x 변수에 대입되어 사용된다.
		fi.method(5);
		
		fi = (x) -> {
			System.out.println(x * 5);
		};
		
		fi.method(5);
		
		fi = (x) -> System.out.println(x * 5);
		
		fi.method(5);
	}
}
