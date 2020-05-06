package AbstractFactory;

public class RetailFactory {
	public static Order processOrder(Channel channel, ProductType productType) {
		Order order = null;
		switch (channel) {
		case TeleCaller:
			order = TeleCallerAgentFactory.processOrder(productType);
			break;
		case ECommerce:
			order = ECommerceWebsiteFactory.processOrder(productType);
			break;
		default:
			break;

		}
		return order;
	}

}
