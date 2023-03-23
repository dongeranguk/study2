package study2.lamda;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		
		// 람다식은 인터페이스 변수에 대입된다.
		// 인터페이스는 직접 객체를 생성할 수 없으므로 구현 클래스를 필요로 한다.
		// 즉, 람다식은 인터페이스 변수에 대입되어 익명 구현 클래스를 생성하고 객체화 한다.
		
		// fi : 람다식의 타겟 타입
		// 람다식은 하나의 추상 메소드를 정의하므로, 모든 인터페이스가 람다식의 타겟 타입이 될 수는 없다.
		
		MyFunctionalInterface fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		fi = () -> { System.out.println("method call2"); };
		
		fi.method();
		
		// 실행문이 하나라면, 중괄호를 생략할 수 있다.
		fi = () -> System.out.println("method call3");
		
		fi.method();
	}
}
