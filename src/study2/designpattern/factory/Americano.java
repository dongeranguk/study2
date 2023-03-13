package study2.designpattern.factory;

public class Americano extends Coffee {

	int price = 0;
	
	public Americano(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
}
