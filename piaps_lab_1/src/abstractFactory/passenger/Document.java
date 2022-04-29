package abstractFactory.passenger;

public class Document implements Passenger{
    @Override
    public void say() {
        System.out.println("Document");
    }
}
