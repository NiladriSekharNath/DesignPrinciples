package AbstractFactory;

public class FurnitureOrder extends Order{

	public FurnitureOrder(Channel channel) {
		super(channel, ProductType.Furniture);
		processOrder();
	}

	@Override
	public void processOrder() {
		System.out.println("Furniture Order Processed...");
		
	}

}
