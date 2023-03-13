package study2.designpattern.factory;

public abstract class Coffee {
	
	abstract int getPrice();
	
	@Override
	public String toString() {
		return "Hi This Coffee is " + this.getPrice();
	}
}
