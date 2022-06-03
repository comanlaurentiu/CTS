package Adapter;

public class AdapterB2A extends DiscountA implements IDiscountB {
	@Override
	public double calculateDiscountB(Customer c) {
		//calculate total of order
		return this.calculateDiscountA(c.getNoOrders());
	}
	
}
