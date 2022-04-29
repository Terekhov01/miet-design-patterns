package abstractFactory.board;

import abstractFactory.driver.Driver;
import abstractFactory.driver.TaxiDriver;
import abstractFactory.passenger.Passenger;

import java.util.ArrayList;
import java.util.List;

public class BoardTaxi implements BoardAnyCar{
    private TaxiDriver instance;
    private List<Passenger> passengers = new ArrayList<>();
    @Override
    public Driver boardDriver() throws Exception {
        if(instance != null){
            throw new Exception("Taxi driver already boarded or busy");
        }
        instance = new TaxiDriver();
        return instance;
    }

    @Override
    public List<Passenger> BoardPassenger(List<Passenger> passengers) throws Exception {
        if (passengers.size() > 4){
            throw new Exception("too many passengers for taxi (max 4)");
        }
        this.passengers.addAll(passengers);
        return this.passengers;
    }

    @Override
    public List<Passenger> BoardPassenger(Passenger passenger) throws Exception {
        if (passengers.size() >= 4){
            throw new Exception("too many passengers for taxi (max 4)");
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
