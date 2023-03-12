package study2.designpattern;

public class Singleton {

	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {} // 생성자 호출을 통해 객체 생성되는 것을 private 접근 제한으로 막음
	
	public static Singleton getInstance() {
		return INSTANCE; // 대신 클래스에서 생성한 객체를 getInstance 메소드 호출을 통해 객체를 얻어옴
	}
}
