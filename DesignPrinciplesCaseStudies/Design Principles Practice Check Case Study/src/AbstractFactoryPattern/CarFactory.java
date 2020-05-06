package AbstractFactoryPattern;

public class CarFactory {

	public static Car buildCar(CarType carType, Location location) {
		if (carType.equals(CarType.MINI)) {
			return new MiniCar(location);
		} else if (carType.equals(CarType.MICRO)) {
			return new MicroCar(location);
		} else
			return new LuxuryCar(location);
	}

}
