package island;

import entities.Position;
import entities.animals.Animal;

import java.util.List;

public interface Cell {
    List<Position> getNeighborsPosition();
    Position getPosition();
    void setNeighborsPosition(List<Position> positions);
    void setAnimals(List<Animal> animals);
    List<Animal> getAnimals();
}
