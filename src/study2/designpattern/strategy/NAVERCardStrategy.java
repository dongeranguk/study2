package study2.designpattern.strategy;

public class NAVERCardStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	public NAVERCardStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using NAVER Card");
	}
}
