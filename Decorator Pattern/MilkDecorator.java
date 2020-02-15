package decoratorPattern;

public class MilkDecorator extends CoffeeDecorator{
	public MilkDecorator(ICoffee iCoffee) {
		super(iCoffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeCoffee() {
		// TODO Auto-generated method stub
		return iCoffee.makeCoffee() + " milk.";
	}
}
