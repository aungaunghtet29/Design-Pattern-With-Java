package MyFactoryPattern;

public class JapanCarFactory extends CarFactory {
	@Override
	public Car makingCar() {
		return new JapanCar();
	}
}
