package study2.designpattern.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Item A = new Item("note", 1000);
		Item B = new Item("pencil", 500);
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(A);
		cart.addItem(B);
		
		cart.pay(new KAKAOCardStrategy("kim", "1234567890", "123", "05/27"));
		cart.pay(new NAVERCardStrategy("example@naver.com", "example"));
		
	}
}
