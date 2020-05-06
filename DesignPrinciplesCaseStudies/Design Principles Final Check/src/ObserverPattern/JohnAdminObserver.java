package ObserverPattern;

public class JohnAdminObserver implements INotificationObserver{
	
	private String Name="";
	
	public JohnAdminObserver() {
		this.Name="John";
	}
	
	@Override
	public void onTicketsBooked() {
		System.out.println("Event details of Event where 100 tickets have been booked notified Admin: "+this.Name);
		
	}

	@Override
	public String toString() {
		return "JohnAdminObserver [Name=" + Name + "]";
	}
	

}
