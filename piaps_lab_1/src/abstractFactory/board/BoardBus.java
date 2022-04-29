package abstractFactory.board;

import abstractFactory.driver.BusDriver;
import abstractFactory.driver.Driver;
import abstractFactory.passenger.BusPassenger;
import abstractFactory.passenger.Passenger;

import java.util.ArrayList;
import java.util.List;

public class BoardBus implements BoardAnyCar{
    private BusDriver instance;
    private List<Passenger> passengers = new ArrayList<>();

    @Override
    public Driver boardDriver() throws Exception {
        if(instance != null){
            throw new Exception("Bus driver already boarded or busy");
        }
        instance = new BusDriver();
        return instance;
    }

    @Override
    public List<Passenger> BoardPassenger(List<Passenger> passengers) throws Exception {
        if (passengers.size() > 30){
            throw new Exception("too many passengers for bus (max 30)");
        }
        this.passengers.addAll(passengers);
        return this.passengers;
    }

    @Override
    public List<Passenger> BoardPassenger(Passenger passenger) throws Exception {
        if (passengers.size() >= 30){
            throw new Exception("too many passengers for bus (max 30)");
        }
        passengers.add(passenger);
        return passengers;
    }

    @Override
    public void unboard() {
        instance = null;
        passengers.clear();
    }
}
