package lab6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Deanery implements IObservable {
    Map<String, HashSet<IObserver>> subscribers = new HashMap<>();

	@Override
	public void subscribe(String group, IObserver subscriber) {
		HashSet<IObserver> groupSubscribers = subscribers.get(group);
		if (groupSubscribers == null) {
			groupSubscribers = new HashSet<IObserver>();
			subscribers.put(group, groupSubscribers);
		}
		
		groupSubscribers.add(subscriber);
		
		System.out.println(subscriber + " subscribed to " + group + " group");
		
	}

	@Override
	public void unsubscribe(String group, IObserver subscriber) {
		HashSet<IObserver> groupSubscribers = subscribers.get(group);
		if (groupSubscribers == null) {
			return;
		}
		
		groupSubscribers.remove(subscriber);
		
		System.out.println(subscriber + " unsubscribed from " + group + " group");
	}

	@Override
	public void notify(String group, String professor) {
		HashSet<IObserver> groupSubscribers = subscribers.get(group);
		if (groupSubscribers != null) {
			for (IObserver subscriber: groupSubscribers) {
				subscriber.update(group, professor);
			}
		}
	}
}
