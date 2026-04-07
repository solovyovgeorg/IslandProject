package engine.handlers;

import island.Cell;

import java.util.List;

public class CellHandler {
    private List<Cell> cellList;
    public CellHandler(List<Cell> cellList){
        this.cellList = cellList;
    }
    public void process(EventHandler eventHandler){
        for (Cell cell: cellList) {
            eventHandler.process(cell);
        }
    }
}
