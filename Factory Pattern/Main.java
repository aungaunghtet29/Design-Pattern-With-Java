package MyFactoryPattern;

public class Main {
	public static void main(String[] args) {
		CarFactory cf = new JapanCarFactory();
		Car car = cf.makingCar();
		System.out.println(car.makeCar());
	}
}
