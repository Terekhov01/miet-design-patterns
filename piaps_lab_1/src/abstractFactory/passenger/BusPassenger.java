package abstractFactory.passenger;

public class BusPassenger implements Passenger {
    @Override
    public void say() {
        System.out.println("bus passenger");
    }
}
