package island;

import java.util.List;
import entities.Position;
import entities.animals.Animal;
import entities.plants.Plants;

public class SimpleCell implements Cell {
    private List<Position> neighborsPositions;
    private Position position;
    private List<Animal> animals;
    private List<Plants> plants;

    public SimpleCell(int x, int y) {
        this.position = new Position(x,y);
    }

    public Position getPosition() {
        return position;
    }

    public List<Plants> getPlants() {
        return plants;
    }

    public void setPlants(List<Plants> plants) {
        this.plants = plants;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
    @Override
    public void setNeighborsPosition(List<Position> neighborsPositions) {
        this.neighborsPositions = neighborsPositions;
    }

    @Override
    public List<Position> getNeighborsPosition() {
        return neighborsPositions;
    }


}
