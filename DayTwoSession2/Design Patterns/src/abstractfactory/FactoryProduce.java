package abstractfactory;

public class FactoryProduce {
	public static Factory getFactory(String brandName) {
		if (brandName.equalsIgnoreCase("Audi"))
			return new AudiFactory();
		else
			return new MercedesFactory();
	}

}
