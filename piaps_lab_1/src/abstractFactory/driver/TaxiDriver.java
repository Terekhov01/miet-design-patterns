package abstractFactory.driver;

public class TaxiDriver implements Driver{
    public static final Categories category = Categories.B;
    @Override
    public void drive() {
        System.out.println("driving taxi");
    }
}
