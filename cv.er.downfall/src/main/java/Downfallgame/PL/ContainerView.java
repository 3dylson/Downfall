package Downfallgame.PL;

import java.util.List;

import Downfallgame.BL.Ball;
import Downfallgame.BL.Container;

/**
 * has the responsibility of drawing to the display, according to the states of
 * the classes it represents. It has three subclasses, each representing a
 * certain Container class. They have to draw their image differently, this is
 * why we need these subclasses.
 */
public class ContainerView {

    private Integer PosX;
    private Integer PosY;
    private Integer[] SlotAngle;
    private Integer[] SlotSize;
    private Integer NSlots;
    private Integer[] NeighbourAngle;
    private Integer NNeighbours;

    public List<Ball> balls;

    public void Notify() {

    }

    public void AddModel(Container model) {

    }
}
