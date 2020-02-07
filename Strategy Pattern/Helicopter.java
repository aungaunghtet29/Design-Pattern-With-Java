package demo.strategy.pattern;

public class Helicopter extends Vehicle {
	public Helicopter() {
		setGoAlgorithms(new GoByFlyingAlgo());
	}
}
