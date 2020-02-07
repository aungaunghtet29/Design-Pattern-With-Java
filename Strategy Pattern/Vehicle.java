package demo.strategy.pattern;

public abstract class Vehicle {
	private GoAlgorithms goAlgorithms;
	
	public String go() {
		return goAlgorithms.go();
	}

	public void setGoAlgorithms(GoAlgorithms goAlgorithms) {
		this.goAlgorithms = goAlgorithms;
	}
	
}
