package engine.generators;

import conf.Config;
import entities.Position;
import island.Cell;
import island.SimpleCell;
import java.util.ArrayList;
import java.util.List;

public class CellGenerator implements EngineGenerator<List<Cell>>{
    private Config config;
    private List<Cell> cells;
    private final int BOUND_X;
    private final int BOUND_Y;

    public CellGenerator(Config config) {
        this.config = config;
        this.BOUND_X = config.getSizeX();
        this.BOUND_Y = config.getSizeY();
    }
    @Override
    public List<Cell> generate() {
        initCells();
        return cells;
    }
    private void initCells(){
        cells = new ArrayList<>();
        for (int x = 0; x < BOUND_X; x++){
            for (int y = 0; y< BOUND_Y; y++) {
                Cell cell = new SimpleCell(x,y);
                initCellNeighbhors(cell);
                cells.add(cell);
            }
        }
    }

    private void initCellNeighbhors(Cell cell) {
        Position position = cell.getPosition();
        List<Position> neighbors = new ArrayList<>();

        if (position.getX() > 0) {
            Position left = new Position(position.getX() - 1, position.getY());
            neighbors.add(left);
        }
        if (position.getX() + 1 < BOUND_X) {
            Position right = new Position(position.getX() + 1, position.getY());
            neighbors.add(right);
        }
        if (position.getY() > 0) {
            Position top = new Position(position.getX(), position.getY() - 1);
            neighbors.add(top);
        }
        if (position.getY() + 1 < BOUND_Y) {
            Position bottom = new Position(position.getX(), position.getY() + 1);
            neighbors.add(bottom);
        }
        cell.setNeighborsPosition(neighbors);
    }
}
