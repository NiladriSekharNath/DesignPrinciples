package ObserverPattern;

public class SteveObserver implements INotificationObserver{
	private String Name = "";
	
	public SteveObserver() {
		this.Name="Steve";
	}
	
	@Override
	public void OnServerDown() {
		System.out.println("The Notification has been received by..."+this.Name);
		
	}

	@Override
	public String toString() {
		return "SteveObserver [Name=" + Name + "]";
	}
	


	

}
