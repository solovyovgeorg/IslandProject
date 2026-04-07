package unittests;
import conf.SimpleConfig;
import entities.animals.Animal;
import entities.animals.AnimalFactory;
import entities.animals.AnimalType;
import java.util.ArrayList;
import java.util.List;

public class AnimalFactoryTest {
    static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        AnimalFactory animalFactory = new AnimalFactory(new SimpleConfig());
        for (int i = 0; i < AnimalType.values().length; i++) {
            animals.add(animalFactory.createAnimalByType(AnimalType.values()[i]));
        }
        animals.stream().map(a->a.getClass().getSimpleName()).forEach(System.out::println);
    }
}
