package abstractFactory.driver;

public class Courier implements Driver{
    public final static Categories category = Categories.A;

    @Override
    public void drive() {
        System.out.println("Courier driving");
    }
}
