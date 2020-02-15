package decoratorPattern;

public class CreamerDecorator extends CoffeeDecorator{

	public CreamerDecorator(ICoffee iCoffee) {
		super(iCoffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeCoffee() {
		// TODO Auto-generated method stub
		return iCoffee.makeCoffee() + " Creamer";
	}

}
