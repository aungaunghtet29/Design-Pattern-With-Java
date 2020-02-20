package MyFactoryPattern;

public class KoreaCarFactory extends CarFactory{
	@Override
	public Car makingCar() {
		return new KoreaCar();
	}
}
