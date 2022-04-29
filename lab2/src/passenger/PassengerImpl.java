package passenger;

public class PassengerImpl implements Passenger{
    private PassengerCategories passengerCategories;
    private int baggage;
    private int age;

    public PassengerImpl(PassengerCategories passengerCategories, int baggage, int age) {
        this.passengerCategories = passengerCategories;
        this.baggage = baggage;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getBaggage() {
        return baggage;
    }

    @Override
    public void say() {

    }

    @Override
    public PassengerCategories getCategory() {
        return passengerCategories;
    }
}
