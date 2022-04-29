package passenger;

public class BusPassenger extends PassengerImpl {
    public BusPassenger(PassengerCategories passengerCategories, int baggage, int age) {
        super(passengerCategories, baggage, age);
    }

    @Override
    public void say() {
        System.out.println("I'm a bus passenger");
    }
}
