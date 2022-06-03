package Adapter;

public class AdapterA2B extends DiscountB implements IDiscountA {
	@Override
	public double calculateDiscountA(int noOrders) {
		Customer c = new Customer("-", noOrders, [0, 0]);
		return this.calculateDiscountB(c);
	}	

}
