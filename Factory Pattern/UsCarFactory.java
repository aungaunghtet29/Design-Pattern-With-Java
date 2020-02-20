package MyFactoryPattern;

public class UsCarFactory extends CarFactory{
	@Override
	public Car makingCar() {
		return new UsCar();
	}
}
