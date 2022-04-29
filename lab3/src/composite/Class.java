package composite;

import category.Category;
import people.BaseHuman;
import people.Human;
import people.Passenger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Class extends BaseHuman {
    private int max_amount;
    private Category category;
    private List<Human> people = new ArrayList<Human>();

    public List<Human> getPeople() {
        return people;
    }

    public Class(Category category, Human... components) throws Exception {
        this.category = category;
        switch (category){
            case FIRST -> {
                MAX_WEIGHT = 60 * 10;
                max_amount = 10;
            }
            case ECONOMY -> {
                MAX_WEIGHT = 60 * 150;
                max_amount = 150;
            }
            case BUSINESS -> {
                max_amount = 20;
                MAX_WEIGHT = 60 * 20;
            }
            case PLANE -> {
                max_amount = 180;
                MAX_WEIGHT = 5000;
            }
        }
        add(components);
    }

    @Override
    public Category getCategory() {
        return category;
    }

    public void add(Human component) throws Exception {
        if (people.size() == max_amount) {
            throw new Exception("Too much");
        }
        people.add(component);
    }

    public void add(Human... components) throws Exception {
        for(Human human: components){
            add(human);
        }
    }

    public void remove(Human human){
        people.remove(human);
    }

    public void clear(){
        people.clear();
    }

    public void checkMaxWeight(){
        if (this.category == Category.PLANE && getWeight() > MAX_WEIGHT){
            for(Human human: people){
                if (human.getCategory() == Category.ECONOMY
                    && human instanceof Class){
                    ((Class) human).people.sort(new Comparator<Human>() {
                        @Override
                        public int compare(Human o1, Human o2) {
                            return (int) (o1.getWeight() - o2.getWeight());
                        }
                    });
                    int i = 0;
                    while (getWeight() > MAX_WEIGHT){
                        ((Class) human).people.get(i).remove();
                        i++;
                    }
                }
            }
        }
    }

    @Override
    public double getWeight() {
        double weight = 0;
        for(Human human: people){
            weight += human.getWeight();
        }
        return weight;
    }

    public void removePassenger(int id){
        for (Human h : getPeople()){
            if (h.getCategory() != null){
                for(Human h1: ((Class)h).getPeople()){
                    if (h1.getId() == id)
                    {
                        if (h1 instanceof Passenger){
                            people.remove(h1);
                            System.out.println(people.contains(h1));
                        } else {
                            System.out.println("Can remove only passenger");
                        }
                    }
                }
            } else{
                if (h.getId() == id)
                {
                    if (h instanceof Passenger){
                        people.remove(h);
                    } else {
                        System.out.println("Can remove only passenger");
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String res = "";
        if (this.getCategory() == Category.PLANE){
            res += getCategory().toString() + ":";
        }
        if (getCategory() != null) {
            for (Human h: people){
                if (h instanceof Class){
                    res += "\n\n--" + h.getCategory().toString() + ":";
                    for (Human h1 : ((Class) h).people){
                        res += h1.toString();
                    }
                }
            }
        } else{
            res += "\n--" + getClass().toString() + ": " + getId() + "\n";
        }
        return res;
    }

    public int getPassengersAmount(){
        int res = 0;
        if (getCategory() != null && getCategory() != Category.PLANE){
            res += this.getPeople().size();
        } else if (getCategory() == Category.PLANE){
            for (Human h: getPeople()){
                if (h.getCategory() != null)
                 res += ((Class)h).getPassengersAmount();
            }
        }
        return res;
    }
}
