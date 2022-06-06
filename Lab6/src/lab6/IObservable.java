package lab6;

public interface IObservable {
	public void subscribe(String department, IObserver subscriber);
	public void unsubscribe(String department, IObserver subscriber);
	public void notify(String department, String professor);
}
