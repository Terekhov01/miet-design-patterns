package builder;

import driver.Driver;
import passenger.Passenger;

import java.util.List;

public interface Builder {
    void setDriver(Driver driver) throws Exception;
    void setPassengers(List<Passenger> passengers) throws Exception;
    void setBaggage() throws Exception;
    void setSafety() throws Exception;
}
