package AbstractFactory;

public class ToysOrder extends Order {

	public ToysOrder(Channel channel) {
		super(channel, ProductType.Toys);
		processOrder();
		
	}

	@Override
	public void processOrder() {
		System.out.println("Toys Order Processed...");
	}

}
