package study2.designpattern.factory;

public class FactoryTest {
	public static void main(String[] args) {
		
		Coffee ame = CoffeeFactory.getCoffee("Americano", 3000);
		Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
		
		System.out.println("Factory Americano :: " + ame);
		System.out.println("Factory Latte :: " + latte);
	}
}
