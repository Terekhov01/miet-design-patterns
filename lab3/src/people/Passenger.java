package people;

import category.Category;

public class Passenger extends BaseHuman{
    private Category category;
    private double baggage;
    private boolean isFree;
    public Passenger(double baggage, Category category) throws Exception {
        if (baggage > 60 || baggage < 5){
            throw new Exception("Baggage's weight must be between 5 and 60");
        }
        this.category = category;
        switch (category){
            case BUSINESS -> MAX_WEIGHT = 35;
            case ECONOMY -> MAX_WEIGHT = 20;
            case FIRST -> MAX_WEIGHT = 60;
        }
        this.baggage = baggage;
        if (baggage > MAX_WEIGHT) isFree = false;
        else isFree = true;
    }

    @Override
    public Category getCategory() {
        return category;
    }

    @Override
    public double getWeight() {
        return baggage;
    }

    @Override
    public void remove() {
        baggage = 0;
    }
}
