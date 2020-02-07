package demo.strategy.pattern;

public class Jet extends Vehicle{
	public Jet() {
		setGoAlgorithms(new GoByFlyingFightAlgo());
	}
}
