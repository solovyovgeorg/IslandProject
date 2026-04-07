package entities.animals;

public class Duck extends Animal implements Food {

    @Override
    public double getFoodWeight() {
        return this.getWeight();
    }
}
