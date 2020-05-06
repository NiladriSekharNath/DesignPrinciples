package AbstractFactory;

public class OrderProcessClient {
	public static void main(String[] args) {
		System.out.println(RetailFactory.processOrder(Channel.ECommerce, ProductType.ElectronicProducts));
		System.out.println(RetailFactory.processOrder(Channel.ECommerce, ProductType.Furniture));
		System.out.println(RetailFactory.processOrder(Channel.ECommerce, ProductType.Toys));
		System.out.println(RetailFactory.processOrder(Channel.TeleCaller, ProductType.ElectronicProducts));
		System.out.println(RetailFactory.processOrder(Channel.TeleCaller, ProductType.Furniture));
		System.out.println(RetailFactory.processOrder(Channel.TeleCaller, ProductType.Toys));
	}

}
