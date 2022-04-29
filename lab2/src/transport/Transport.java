package transport;

import driver.Driver;
import passenger.Passenger;

import java.util.List;

public class Transport {
    private final Driver driver;
    private final List<Passenger> passengers;
    private final int baggage;
    private final boolean safety;

    public Transport(Driver driver, List<Passenger> passengers, int age, boolean safety) {
        this.driver = driver;
        this.passengers = passengers;
        this.baggage = age;
        this.safety = safety;
    }

    public Driver getDriver() {
        return driver;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public int getBaggage() {
        return baggage;
    }

    public boolean isSafety() {
        return safety;
    }

    public String info() {
        return "Transport{" +
                "driver=" + driver +
                ", passengers=" + passengers.size() +
                ", baggage, kg=" + baggage +
                ", safety=" + safety +
                '}';
    }
}
