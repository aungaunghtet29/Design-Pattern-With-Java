package decoratorPattern;

public class Main {
	public static void main(String[] args) {
		ICoffee iCoffee = new ToppingDecorator(
				new MilkDecorator(
						new CreamerDecorator(
								new SugarDecorator(
										new PlainCoffee()))));
		System.out.println(iCoffee.makeCoffee());
	}
}
