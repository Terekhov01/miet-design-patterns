package people;

import category.Category;

public interface Human {
    double getWeight();
    double getMaxWeight();
    Category getCategory();
    void remove();
    int getId();
}
