package entities.plants;


import entities.animals.Food;

public class Plants implements Food {


    @Override
    public double getFoodWeight() {
        return 1;
    }
}
