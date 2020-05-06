package AbstractFactory;

public class ElectronicOrder extends Order{

	public ElectronicOrder(Channel channel) {
		super(channel, ProductType.ElectronicProducts);
		processOrder();
	}

	@Override
	public void processOrder() {
		System.out.println("Electronic Products Order Processed...");
		
		
	}

}
