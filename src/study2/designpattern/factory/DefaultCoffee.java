package study2.designpattern.factory;

public class DefaultCoffee extends Coffee {

	private int price;
	
	public DefaultCoffee(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
}
