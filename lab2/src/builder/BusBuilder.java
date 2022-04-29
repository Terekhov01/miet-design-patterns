package builder;

import driver.Driver;
import passenger.Passenger;
import transport.Transport;

import java.util.List;
import java.util.stream.IntStream;

public class BusBuilder implements Builder{
    private Driver driver;
    private List<Passenger> passengers;
    private int baggage;
    private boolean safety = false;


    @Override
    public void setDriver(Driver driver) throws Exception {
        if(this.driver != null){
            throw new Exception("Taxi driver already boarded or busy");
        }
        this.driver = driver;
    }

    @Override
    public void setBaggage() throws Exception {
        for(Passenger p : passengers){
            baggage += p.getBaggage();
        }
    }

    @Override
    public void setSafety() throws Exception {
        this.safety = true;
    }

    @Override
    public void setPassengers(List<Passenger> passengers) throws Exception {
        if (passengers.size() > 30 || passengers.size() < 1)
            throw new Exception("Amount of passenger should be between 1 and 30");
        this.passengers = passengers;
    }

    public Transport getResult(){
        return new Transport(driver, passengers, baggage, safety);
    }
}
