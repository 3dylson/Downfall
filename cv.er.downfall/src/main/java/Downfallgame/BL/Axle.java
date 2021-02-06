package Downfallgame.BL;

import java.util.List;

/**
 * Know its wheels, to turn them, and to know the ratio how much a degree should
 * turn the wheel during turning, and to what direction.
 */
public class Axle {

    
    private List<Wheel> wheels;

    /** Turns all its wheels with the given angle. */
    public void TurnTo() {
       
    }

    /** Adds a new wheel to the axle. */
    public void AddWheel(Wheel wheel) {
        this.wheels.add(wheel);         
    }
    
}
