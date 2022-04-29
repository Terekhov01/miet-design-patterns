package abstractFactory.board;

import abstractFactory.driver.Driver;
import abstractFactory.passenger.Passenger;

import java.util.List;

public interface BoardAnyCar {
    Driver boardDriver() throws Exception;
    List<Passenger> BoardPassenger(List<Passenger> passengers) throws Exception;
    List<Passenger> BoardPassenger(Passenger passenger) throws Exception;
    void unboard();
}
