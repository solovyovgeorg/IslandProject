package engine.generators;

import conf.Config;
import entities.Position;
import entities.animals.Animal;
import entities.animals.AnimalFactory;
import entities.animals.AnimalType;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalGenerator implements EngineGenerator<List<Animal>> {
    private final Config config;
    private List<Animal> animals;
    private AnimalFactory animalFactory;
    private Random random;
    private final int COUNT_ANIMALS_ON_START;

    public AnimalGenerator(Config config) {
        this.config = config;
        this.COUNT_ANIMALS_ON_START = config.getCountAnimalsOnStart();
        this.animalFactory = new AnimalFactory(config);
        this.random = new Random();
    }

    private AnimalType getRandomAnimalType() {
        int bound = AnimalType.values().length;
        int randomIndex = random.nextInt(0, bound);
        return AnimalType.values()[randomIndex];
    }

    private Animal getRandomAnimal() {
       Animal randomAnimal = animalFactory.createAnimalByType(getRandomAnimalType());
       randomAnimal.setPosition(getRandomPosition());
        return randomAnimal;
    }

    private Position getRandomPosition() {
        int randomX = random.nextInt(0,config.getSizeX());
        int randomY = random.nextInt(0,config.getSizeY());
        return new Position(randomX,randomY);
    }

    @Override
    public List<Animal> generate() {
        animals = new ArrayList<>();
        for (int i = 0; i < COUNT_ANIMALS_ON_START; i++) {
            animals.add(getRandomAnimal());
        }
        return animals;
    }
}
