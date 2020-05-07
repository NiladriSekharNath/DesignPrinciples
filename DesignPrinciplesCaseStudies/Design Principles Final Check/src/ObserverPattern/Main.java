package ObserverPattern;

public class Main {
	public static void main(String[] args) {
		INotificationService iNotificationService = new NotificationService();
		INotificationObserver admin1 = new Admin(iNotificationService, "Mr X", 105);
		INotificationObserver admin2 = new Admin(iNotificationService, "Mr Y", 99);
		INotificationObserver admin3 = new Admin(iNotificationService, "Mr Z", 101);
		
		System.out.println("Adding Subscribers......");
		iNotificationService.addSubscriber(admin1);
		iNotificationService.addSubscriber(admin2);
		iNotificationService.addSubscriber(admin3);
		System.out.println("Current Subscribers.....");
		iNotificationService.notifySubscriber();
		System.out.println("Removing Admins currently Apting Out of Notification Service.....");
		iNotificationService.removeSubscriber(admin1);
		System.out.println("Current Subscribers.....");
		iNotificationService.notifySubscriber();
	}
}
