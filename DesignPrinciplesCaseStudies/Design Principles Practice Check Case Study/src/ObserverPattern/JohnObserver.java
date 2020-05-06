package ObserverPattern;

public class JohnObserver implements INotificationObserver {

	private String Name = " ";

	public JohnObserver() {
		this.Name = "John";
	}

	@Override
	public void OnServerDown() {
		System.out.println("The Notification has been received by..." + this.Name);

	}

	@Override
	public String toString() {
		return "JohnObserver [Name=" + Name + "]";
	}
	

}
