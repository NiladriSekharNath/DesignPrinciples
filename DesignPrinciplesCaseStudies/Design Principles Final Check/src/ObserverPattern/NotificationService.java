package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> list = new ArrayList<>();

	@Override
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		list.add(iNotificationObserver);
		System.out.println(list);

	}

	@Override
	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		list.remove(iNotificationObserver);
		System.out.println(list);

	}

	@Override
	public void notifySubscriber() {
		for (INotificationObserver observer : list)
			if (observer.getNoOfTickets() > 100)
				observer.notification();
	}

}