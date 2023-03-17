package study2.generic;

public class BoxExample {
	public static void main(String[] args) {
		
		Box b1 = Util.<Integer>boxing(100);
		System.out.println(b1.get());
		
		Box b2 = Util.<String>boxing("hello");
		System.out.println(b2.get());
	}
}
