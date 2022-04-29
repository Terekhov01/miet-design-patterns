package director;

import builder.Builder;
import driver.BusDriver;
import driver.TaxiDriver;
import passenger.Passenger;
import passenger.PassengerCategories;
import passenger.TaxiPassenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Director {
    public void boardTaxi(Builder builder) throws Exception {
        builder.setDriver(new TaxiDriver());

        Random random = new Random();
        int m = random.nextInt(5);
        List<Passenger> passengers = new ArrayList<>(){{
            for(int i=0;i<m;i++){
                add(new TaxiPassenger(PassengerCategories.values()[random.nextInt(2)], random.nextInt(10), random.nextInt(90)));
            }
        }};
        builder.setPassengers(passengers);
        builder.setBaggage();
        builder.setSafety();
    }
    public void boardBus(Builder builder) throws Exception {
        builder.setDriver(new BusDriver());

        Random random = new Random();
        int m = random.nextInt(31);
        List<Passenger> passengers = new ArrayList<>(){{
            for(int i=0;i<m;i++){
                add(new TaxiPassenger(PassengerCategories.values()[random.nextInt(3)],
                        random.nextInt(8), random.nextInt(90)));
            }
        }};
        builder.setPassengers(passengers);
        builder.setBaggage();
        builder.setSafety();
    }
}
