package AbstractFactory;

public class TeleCallerAgentFactory {
	
		public static Order processOrder(ProductType productType) {
			Order order=null;
			switch (productType) {
			case ElectronicProducts:
				order=new ElectronicOrder(Channel.TeleCaller);
				break;
			case Furniture:
				order=new FurnitureOrder(Channel.TeleCaller);
				break;
			case Toys:
				order=new ToysOrder(Channel.TeleCaller);
				break;
			default:
				break;
			}
			return order;
			
		}

}
