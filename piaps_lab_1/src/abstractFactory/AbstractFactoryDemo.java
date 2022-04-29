package abstractFactory;

import abstractFactory.board.BoardAnyCar;
import abstractFactory.board.BoardBus;
import abstractFactory.board.BoardCourier;
import abstractFactory.board.BoardTaxi;
import abstractFactory.driver.Driver;
import abstractFactory.passenger.BusPassenger;
import abstractFactory.passenger.Document;
import abstractFactory.passenger.Passenger;
import abstractFactory.passenger.TaxiPassenger;

import java.util.Random;

public class AbstractFactoryDemo {
    private BoardAnyCar boardAnyCar;
    public static void main(String[] args) {
        AbstractFactoryDemo abstractFactoryDemo = new AbstractFactoryDemo();
        try {
            abstractFactoryDemo.boardTaxi();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            abstractFactoryDemo.boardBus();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            abstractFactoryDemo.boardCourier();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void boardCourier() throws Exception{
        Random random = new Random();
        int m = random.nextInt(4);
        boardAnyCar = new BoardCourier();
        for(int i=0;i<3;i++){
            Driver courier = boardAnyCar.boardDriver();
            for(int j=0;j<m;j++){
                Passenger document = new Document();
                boardAnyCar.BoardPassenger(document).get(j).say();
            }
            courier.drive();
            boardAnyCar.unboard();
        }
    }
    public void boardTaxi() throws Exception {
        Random random = new Random();
        int m = random.nextInt(8);
        boardAnyCar = new BoardTaxi();
        for(int i=0;i<3;i++){
            Driver taxiDriver = boardAnyCar.boardDriver();
            for(int j=0;j<m;j++){
                Passenger passenger = new TaxiPassenger();
                boardAnyCar.BoardPassenger(passenger).get(j).say();
            }
            taxiDriver.drive();
            boardAnyCar.unboard();
        }
    }
    public void boardBus() throws Exception {
        Random random = new Random();
        int m = random.nextInt(8);
        boardAnyCar = new BoardBus();
        Driver busDriver = boardAnyCar.boardDriver();
        for(int j=0;j<m;j++){
            Passenger passenger = new BusPassenger();
            boardAnyCar.BoardPassenger(new BusPassenger()).get(j).say();
        }
        busDriver.drive();

        Driver busDriver1 = boardAnyCar.boardDriver();
        for(int j=0;j<m;j++){
            boardAnyCar.BoardPassenger(new BusPassenger());
        }
        busDriver1.drive();
    }
}
