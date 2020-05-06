package AbstractFactoryPattern;

public class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Connecting To Micro Car");

	}

}
