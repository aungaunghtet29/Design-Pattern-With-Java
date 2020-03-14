package templateMethod_Pattern;

public class NewYorkPizzaTemplate2 extends PlizzaTemplate{
	@Override
	public void addTopping() {
		System.out.println("NewYork Pizza Topping");
	}
	@Override
	public void bake() {
		System.out.println("NewYork Pizza Bake");
	}
	@Override
	public void prepared() {
		System.out.println("NewYork Pizza prepared");
	}
	@Override
	public void serve() {
		System.out.println("NewYork Pizza serve");
	}
}
