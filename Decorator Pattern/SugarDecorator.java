package decoratorPattern;

public class SugarDecorator extends CoffeeDecorator{

	public SugarDecorator(ICoffee iCoffee) {
		super(iCoffee);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String makeCoffee() {
		// TODO Auto-generated method stub
		return iCoffee.makeCoffee() + " sugar.";
	}

}
