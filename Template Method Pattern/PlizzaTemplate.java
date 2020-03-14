package templateMethod_Pattern;

public abstract class PlizzaTemplate {
	// template method
	public final void pizza() {
		prepared();
		addTopping();
		bake();
		serve();
	}

	public abstract void prepared();

	public abstract void addTopping();

	public abstract void bake();

	public abstract void serve();
}
