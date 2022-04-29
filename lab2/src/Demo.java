import builder.BusBuilder;
import builder.TaxiBuilder;
import director.Director;
import transport.Transport;

public class Demo {
    public static void main(String[] args) throws Exception {
        Director director = new Director();

        BusBuilder busBuilder = new BusBuilder();
        director.boardBus(busBuilder);

        Transport bus = busBuilder.getResult();
        System.out.println("Bus built:");
        bus.getDriver().drive();
        System.out.println(bus.info());


        TaxiBuilder taxiBuilder = new TaxiBuilder();
        director.boardTaxi(taxiBuilder);

        Transport taxi = taxiBuilder.getResult();
        System.out.println("\nTaxi built:");
        taxi.getDriver().drive();
        System.out.println(taxi.info());
    }
}
