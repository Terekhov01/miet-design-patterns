package people;

import category.Category;

public class BaseHuman implements Human{
    private static int counter = 0;
    private int id;
    public double MAX_WEIGHT = 0;

    public BaseHuman() {
        this.id = counter++;
    }

    @Override
    public double getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void remove() {

    }

    @Override
    public Category getCategory() {
        return null;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String toString() {
        return "\n----" + getClass() + ": " + getId();
    }
}
