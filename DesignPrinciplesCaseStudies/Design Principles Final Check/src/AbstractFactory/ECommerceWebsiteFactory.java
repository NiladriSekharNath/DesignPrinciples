package AbstractFactory;

public class ECommerceWebsiteFactory {
	public static Order processOrder(ProductType productType) {
		Order order=null;
		switch (productType) {
		case ElectronicProducts:
			order=new ElectronicOrder(Channel.ECommerce);
			break;
		case Furniture:
			order=new FurnitureOrder(Channel.ECommerce);
			break;
		case Toys:
			order=new ToysOrder(Channel.ECommerce);
			break;
		default:
			break;
		}
		return order;
		
	}

}
