package AbstractFactoryPattern;

public class CarFactory {
	private CarFactory() {
		
	}
	public static Car buildCar(CarType carType,Location location) {
		Car car=null;
		
		switch(location) {
			case USA:
				car=USACarFactory.buildCar(carType);
				break;
			case INDIA:
				car=INDIACarFactory.buildCar(carType);
				break;
			default:
				car=DefaultCarFactory.buildCar(carType);
				break;
		
		}
		return car;
	}
	

}
