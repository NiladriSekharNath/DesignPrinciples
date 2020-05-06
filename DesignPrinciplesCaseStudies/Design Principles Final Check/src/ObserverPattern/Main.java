package ObserverPattern;

public class Main {
	public static void main(String[] args) {
		RobinAdminObserver robinObserver =new RobinAdminObserver();
		JohnAdminObserver johnObserver=new JohnAdminObserver();
		NotificationService notificationService=new NotificationService();
		notificationService.addSubscriber(robinObserver);
		notificationService.addSubscriber(johnObserver);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(johnObserver);
	}
	

}
