package passenger;

public class TaxiPassenger extends PassengerImpl {
    @Override
    public void say() {
        System.out.println("I'm a taxi passenger");
    }

    public TaxiPassenger(PassengerCategories passengerCategories, int baggage, int age) {
        super(passengerCategories, baggage, age);
    }
}
