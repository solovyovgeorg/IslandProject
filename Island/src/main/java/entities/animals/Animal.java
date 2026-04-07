package entities.animals;

import entities.Position;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class Animal{
   protected double weight;
   protected double speed;
   protected double foodCapacity;
   protected AnimalType animalType;
   protected boolean isAlive;
   protected int limitOfChild;
   protected int countOfChild;
   protected long lifeLength;
   protected Position position;
   protected List<Position> positionToMove;
   protected Random random = new Random();

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    protected int id;
   protected Map<AnimalType,Integer> foodMap;

       public double eat(Food food){
           return food.getFoodWeight();
       };
       public void move(){
           int bound = positionToMove.size();
           if (bound > 0) {
               Position movePosition = positionToMove.get(random.nextInt(0, bound));
               this.position = movePosition;
           }
       }
       public boolean reproduce(){
               return countOfChild >= limitOfChild;
       }
       public void die(){
           this.setAlive(false);
       };


    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFoodCapacity() {
        return foodCapacity;
    }

    public void setFoodCapacity(double foodCapacity) {
        this.foodCapacity = foodCapacity;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public long getLifeLength() {
        return lifeLength;
    }

    public void setLifeLength(long lifeLength) {
        this.lifeLength = lifeLength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<AnimalType, Integer> getFoodMap() {
        return foodMap;
    }

    public void setFoodMap(Map<AnimalType, Integer> foodMap) {
        this.foodMap = foodMap;
    }

}
