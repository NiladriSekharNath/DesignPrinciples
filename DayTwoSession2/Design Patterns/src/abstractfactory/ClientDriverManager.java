package abstractfactory;

public class ClientDriverManager {
	public static void main(String[] args) {
		Factory audiFactory = FactoryProduce.getFactory("Audi");
		System.out.println("Audi Factory Class " + audiFactory.getClass().getSimpleName());
		AudiHeadlight audiHeadLight = (AudiHeadlight) audiFactory.makeHeadLight();
		audiHeadLight.show();
		AudiTire audiTire = (AudiTire) audiFactory.makeTire();
		audiTire.show();
		Factory mercedesFactory = FactoryProduce.getFactory("Mercedes");
		System.out.println("Mercedes Factory Class " + mercedesFactory.getClass().getSimpleName());
		MercedesHeadlight mercedesHeadLight = (MercedesHeadlight) mercedesFactory.makeHeadLight();
		mercedesHeadLight.show();
		MercedesTire makeTire = (MercedesTire) mercedesFactory.makeTire();
		makeTire.show();

	}

}
