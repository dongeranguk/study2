package study2.generic;

public class ProductExample {
	public static void main(String[] args) {
		
		Product<Tv, String> a = new Product<>();
		
		Tv tv = new Tv("TV");
		
		a.setKind(tv);
		a.setModel("스마트 TV");
		
		System.out.println(a.getKind());
		System.out.println(a.getModel());
		
		Product<Car, String> b = new Product<>(new Car("CAR"), "디젤");
	
		System.out.println(b);
	}
}
