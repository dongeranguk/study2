package study2.generic;

public class PairExample {
	public static void main(String[] args) {
		
		
		Pair<String, Integer> p1 = new Pair<>("홍길동", 27);
		Pair<String, Integer> p2 = new Pair<>("홍길동", 27);
		
		Pair<String, Integer> p3 = new Pair<>("김대한", 25);
		Pair<String, Integer> p4 = new Pair<>("김민국", 23);

		boolean result1 = Util.compare(p1, p2);
		boolean result2 = Util.<String, Integer>compare(p3, p4);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
