package ObserverPattern;

public class Admin extends INotificationObserver{

	public Admin(INotificationService iNotificationService, String name, int noOfTickets) {
		super(iNotificationService, name, noOfTickets);
		notification();
	}

	@Override
	public void notification() {
		System.out.println("Hello "+name +" .");
		System.out.println("Your Event will start soon...");
		
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", noOfTickets=" + noOfTickets + "]";
	}

	
}
