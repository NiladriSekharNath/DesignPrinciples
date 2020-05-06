package ObserverPattern;

public interface INotificationService {
	public void addSubscriber(INotificationObserver iNotificationObserver);
	public void removeSubscriber(INotificationObserver iNotificationObserver);
	public void notifySubscriber();

}
