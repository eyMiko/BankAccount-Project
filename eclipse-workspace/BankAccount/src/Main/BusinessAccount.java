package Main;

public class BusinessAccount extends Account {

	private double amount;
	
	@Override
	public double getTotal() {	
		System.out.println("Your total is " + amount);
		return amount;
	}

	@Override
	public double addAmount(double value) {
		return amount+= value;
	}

	@Override
	public double subAmount(double value) {
		return amount -= value;
	}

}
