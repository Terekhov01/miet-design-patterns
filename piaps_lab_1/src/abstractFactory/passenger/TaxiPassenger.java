package abstractFactory.passenger;

public class TaxiPassenger implements Passenger {
    @Override
    public void say() {
        System.out.println("Taxi passenger");
    }
}
