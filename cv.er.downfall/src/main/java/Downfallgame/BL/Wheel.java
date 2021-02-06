package Downfallgame.BL;

import java.util.List;

/**
 * A wheel has to turn a certain degree, during the turn it checks if there are
 * donors or acceptors.
 */
public class Wheel extends Container {

    protected int Radius;
    protected int Angle;

    public Axle Axle;

    public Wheel(){}

    public Wheel(int Radius, int Angle){
        this.Radius = Radius;
        this.Angle = Angle;
    }

    public void TurnTo(Integer Angle) {

    }

    protected Container TurnTill(Integer Angle) {
        return null;

    }

    protected void SetBall(Container donor, Ball ball) {
        
    }
    
    protected void DeleteBall(Ball ball) {
        
    }


    /**
     * 
     * @return the current angle.
     */
    public Integer GetAngle() {
        return Angle;
        
    }
        
    
    
}
