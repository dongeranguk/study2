package study2.designpattern;

public class SingletonTest {
	public static void main(String[] args) {
		
//		Singleton a = new Singleton(); 생성자의 접근 제한을 private 로 지정했기 때문에, 생성자 호출 불가
		
		Singleton b = Singleton.getInstance(); // 생성자 대신 getInstance 메소드 호출을 통해 객체를 생성
		Singleton c = Singleton.getInstance();
		
		System.out.println(b.hashCode());
		System.out.println(c.hashCode()); // 둘 다 같은 객체인 것을 확인할 수 있다.
		
		if(b == c) {
			System.out.println("This is a Singleton");
		} else {
			System.out.println("This is not a Singleton");
		}
	}
}
