package demo.strategy.pattern;

public class FormulaOne extends Vehicle{
	public FormulaOne() {
		setGoAlgorithms(new GoByDrivingAlgo());
	}
}
