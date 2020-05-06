package AbstractFactory;

public abstract class Order {
	Channel channel = null;
	ProductType productType = null;

	public Order(Channel channel, ProductType productType) {
		super();
		this.channel = channel;
		this.productType = productType;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Order [channel=" + channel + ", productType=" + productType + "]";
	}
	
	public abstract void processOrder();

}
