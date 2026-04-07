package conf;

import entities.animals.AnimalType;
import java.util.HashMap;
import java.util.Map;

public class SimpleConfig implements Config{
    private static final Map<AnimalType,Map<AnimalType, Integer>> FOOD_MAP = getTypeFoodMap();
    private final int CountAnimalOnStart = 240000;
    private final int SIZE_X = 200;
    private final int SIZE_Y = 200;


    private static Map<AnimalType,Map<AnimalType, Integer>> getTypeFoodMap() {
        Map<AnimalType,Integer> forFood = typeToTypeMap(AnimalType.DUCK);
        /// Вычисление под все типы
        Map<AnimalType,Map<AnimalType, Integer>> typeFoodMap = new HashMap<>();
        return typeFoodMap;
    }

    private static Map<AnimalType,Integer> typeToTypeMap (AnimalType animalType){
        /// вычисление под указанный тип
        return new HashMap<>();
    }



    @Override
    public Map<AnimalType, Integer> getFoodMapForType(AnimalType type) {
        return Map.of();
    }

    @Override
    public int getSizeX() {
        return this.SIZE_X;
    }

    @Override
    public int getSizeY() {
        return this.SIZE_Y;
    }

    @Override
    public int getCountAnimalsOnStart() {
        return this.CountAnimalOnStart;
    }
}
