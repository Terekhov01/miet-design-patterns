package abstractFactory.board;

import abstractFactory.driver.Courier;
import abstractFactory.driver.Driver;
import abstractFactory.passenger.Passenger;

import java.util.ArrayList;
import java.util.List;

public class BoardCourier implements BoardAnyCar{
    private Courier instance;
    private List<Passenger> documents = new ArrayList<>();
    @Override
    public Driver boardDriver() throws Exception {
        if(instance != null){
            throw new Exception("Courier driver already boarded or busy");
        }
        instance = new Courier();
        return instance;
    }

    @Override
    public List<Passenger> BoardPassenger(List<Passenger> passengers) throws Exception {
        if (passengers.size() > 5){
            throw new Exception("too many documents for courier (max 5)");
        }
        this.documents.addAll(passengers);
        return this.documents;
    }

    @Override
    public List<Passenger> BoardPassenger(Passenger passenger) throws Exception {
        if (documents.size() >= 5){
            throw new Exception("too many documents for courier (max 5)");
        }
        documents.add(passenger);
        return documents;
    }

    @Override
    public void unboard() {
        instance = null;
        documents.clear();
    }
}
