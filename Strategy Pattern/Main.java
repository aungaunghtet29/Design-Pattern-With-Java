package demo.strategy.pattern;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = new FormulaOne();
		System.out.println(vehicle.go());
	}
}
