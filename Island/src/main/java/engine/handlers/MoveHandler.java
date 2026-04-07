package engine.handlers;

import island.Cell;

public class MoveHandler implements EventHandler{
    private Cell cell;
    @Override
    public void process (Cell cell) {
        this.cell = cell;
    }
}
