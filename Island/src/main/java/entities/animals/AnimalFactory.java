package entities.animals;

import conf.Config;

public class AnimalFactory {
    private final Config config;
    public AnimalFactory(Config config){
        this.config = config;
    }
    public Animal createAnimalByType(AnimalType animalType) {
        return switch (animalType) {
            case WOLF -> createAndInitAnimal(new Wolf(),animalType);
    /*        case SNAKE -> null;
            case FOX -> null;
            case BEAR -> null;
            case EAGLE -> null;
            case HORSE -> null;
            case DEER -> null;
            case RABBIT -> null;
            case MOUSE -> null;
            case GOAT -> null;
            case SHEEP -> null;
            case PIG -> null;
            case BUFFALO -> null;*/
            case DUCK -> createAndInitAnimal(new Duck(), animalType);
    /*        case CATERPILLAR -> null;
            case PLANT -> null;*/
        };
    }

    private Animal createAndInitAnimal(Animal animal, AnimalType animalType) {
        animal.setAnimalType(animalType);
        animal.setAlive(true);
        animal.setFoodMap(config.getFoodMapForType(animalType));
        return animal;
    }
}
