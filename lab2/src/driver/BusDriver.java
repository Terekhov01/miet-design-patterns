package driver;

public class BusDriver implements Driver {
    public final static Categories category = Categories.D;

    @Override
    public void drive() {
        System.out.println("Driving bus");
    }

    @Override
    public Categories getCategory() {
        return category;
    }
}
