import category.Category;
import composite.Class;
import people.Human;
import people.Passenger;
import people.Pilot;
import people.Stewardess;

import java.util.Random;

public class Demo {
    Class plane = new Class(Category.PLANE);

    public Demo() throws Exception {
    }

    public void loadPlane() throws Exception {
        plane.clear();
        Random random = new Random();
        Passenger[] passengerEco = new Passenger[150];
        for(int i=0;i<150;i++){
            passengerEco[i] = new Passenger(random.nextDouble(55)+5, Category.ECONOMY);
        }

        Passenger[] passengerBusiness = new Passenger[20];
        for(int i=0;i<20;i++){
            passengerBusiness[i] = new Passenger(random.nextDouble(55)+5, Category.BUSINESS);
        }

        Passenger[] passengerFirst = new Passenger[10];
        for(int i=0;i<10;i++){
            passengerFirst[i] = new Passenger(random.nextDouble(55)+5, Category.FIRST);
        }

        plane.add(new Pilot(4), new Pilot(3),
                new Stewardess(), new Stewardess(), new Stewardess(), new Stewardess(),
                new Stewardess(), new Stewardess(),
                new Class(Category.ECONOMY, passengerEco),
                new Class(Category.BUSINESS, passengerBusiness),
                new Class(Category.FIRST, passengerFirst));

    }

    void remove(int id){
        plane.removePassenger(id);
    }

    public static void main(String[] args) throws Exception {
        Demo demo = new Demo();
        demo.loadPlane();
        System.out.println(demo.plane);
        System.out.printf("Weight: %.3f \n", demo.plane.getWeight());
        demo.plane.checkMaxWeight();
        System.out.printf("Weight: %.3f \n", demo.plane.getWeight());
        System.out.println(demo.plane.getPassengersAmount());
        demo.remove(151);
        System.out.println(demo.plane.getPassengersAmount());

    }


}
