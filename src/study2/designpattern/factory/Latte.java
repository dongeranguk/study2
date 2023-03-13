package study2.designpattern.factory;

public class Latte extends Coffee {

	int price = 0;
	
	public Latte(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
}
