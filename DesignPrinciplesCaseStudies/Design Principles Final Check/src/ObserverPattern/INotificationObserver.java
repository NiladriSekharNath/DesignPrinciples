package ObserverPattern;

public abstract class INotificationObserver {
	protected INotificationService iNotificationService;
	protected String name;
	protected int noOfTickets;
	
	public INotificationObserver(INotificationService iNotificationService, String name, int noOfTickets) {
		super();
		this.iNotificationService = iNotificationService;
		this.name = name;
		this.noOfTickets = noOfTickets;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}
	
	public abstract void notification();

	
	
	
	

}
