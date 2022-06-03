package decorator;

public class DecoratorPizza extends APizza{
	
	protected APizza pizza;
	
	public DecoratorPizza(APizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return pizza.getIngredients();
	}

	@Override
	public float getCostTotal() {
		// TODO Auto-generated method stub
		return pizza.getCostTotal();
	}

}
