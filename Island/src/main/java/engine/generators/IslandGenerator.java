package engine.generators;

import conf.Config;
import engine.handlers.CellHandler;
import entities.Position;
import entities.animals.Animal;
import island.Cell;
import island.Island;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IslandGenerator implements EngineGenerator<Island> {
    private Island island;
    private final Config config;
    private final AnimalGenerator animalGenerator;
    private final CellGenerator cellGenerator;

    public IslandGenerator(Config config) {
        this.config = config;
        this.animalGenerator = new AnimalGenerator(config);
        this.cellGenerator = new CellGenerator(config);
    }


    @Override
    public Island generate() {
        island = new Island();
        List<Animal> animals = animalGenerator.generate();
        List<Cell> cells = cellGenerator.generate();
        integrateAnimalOnCell(cells,animals);
        island.setCells(cells);
        return island;
    }
    private void integrateAnimalOnCell(List<Cell> cells, List<Animal> animals){
        Map<Position, List<Animal>> animalsByPosition = animals.stream().collect(Collectors.groupingBy(Animal::getPosition));
        for (Cell cell:cells){
           List<Animal> animalsToCell = animalsByPosition.getOrDefault(cell.getPosition(), Collections.emptyList());
           cell.setAnimals(new ArrayList<>(animalsToCell));
        }
    }
}
