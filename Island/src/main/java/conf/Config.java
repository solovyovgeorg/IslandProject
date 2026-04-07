package conf;
import entities.animals.AnimalType;
import java.util.Map;

public interface Config {
    Map<AnimalType,Integer> getFoodMapForType(AnimalType type);
    int getSizeX();
    int getSizeY();

    int getCountAnimalsOnStart();
}
