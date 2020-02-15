package decoratorPattern;

public class ToppingDecorator extends CoffeeDecorator{

	public ToppingDecorator(ICoffee iCoffee) {
		super(iCoffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeCoffee() {
		// TODO Auto-generated method stub
		return iCoffee.makeCoffee() + " Topping";
	}
	
}
