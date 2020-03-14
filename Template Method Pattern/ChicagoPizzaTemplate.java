package templateMethod_Pattern;

public class ChicagoPizzaTemplate extends PlizzaTemplate{
	@Override
	public void addTopping() {
		System.out.println("Chicago Pizza Topping");
	}
	@Override
	public void bake() {
		System.out.println("Chicago Pizza Bake");
	}
	@Override
	public void prepared() {
		System.out.println("Chicago Pizza prepared");
	}
	@Override
	public void serve() {
		System.out.println("Chicago Pizza serve");
	}
}
