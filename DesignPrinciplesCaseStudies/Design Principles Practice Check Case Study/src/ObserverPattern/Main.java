package ObserverPattern;

public class Main {
	public static void main(String[] args) {
		SteveObserver steveObserver =new SteveObserver();
		JohnObserver johnObserver=new JohnObserver();
		NotificationService notificationService=new NotificationService();
		notificationService.addSubscriber(steveObserver);
		notificationService.addSubscriber(johnObserver);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(johnObserver);
	}
	

}
