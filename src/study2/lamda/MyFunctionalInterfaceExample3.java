package study2.lamda;

public class MyFunctionalInterfaceExample3 {
	public static void main(String[] args) {
		
		
		MyFunctionalInterface3 fi = (x, y) -> {
			int result = x * y;
			return result;
		};
		
		int answer = fi.method(7, 7);
		System.out.println(answer);
		
		fi = (x, y) -> {
			return x * y;
		};
		
		int answer2 = fi.method(7, 8);
		System.out.println(answer2);
		
		// 리턴문만 있을 경우 중괄호와 return문 생략이 가능하다.
		
		fi = (x, y) -> x * y;
		
		int answer3 = fi.method(7, 9);
		System.out.println(answer3);
		
		// 리턴 타입이 같은 다른 메소드를 호출할 수도 있다.
		fi = (x, y) -> sum(x, y);
		
		int answer4 = fi.method(7, 9);
		System.out.println(answer4);
	}

	public static int sum(int x, int y) {
		return x + y;
	}
}
