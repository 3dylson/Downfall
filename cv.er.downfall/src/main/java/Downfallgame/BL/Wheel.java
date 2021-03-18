package Downfallgame.BL;

/**
 * A wheel has to turn a certain degree, during the turn it checks if there are
 * donors or acceptors.
 */
public class Wheel extends Container {

    /** the radius of the wheel. Necessary when drawing. */
    protected int Radius;
    /** the angle of relative displacement at the moment. */
    protected int Angle = 0;

    public Wheel(int Radius, int Angle) {
        this.Radius = Radius;
        this.Angle = Angle;
    }

    /**
     * Turn wheel to angle. If slots are turned to neighbor angles, Receive and
     * Offer messages are triggered.
     * 
     * @param Angle
     */
    public void TurnTo(int Angle) {

    }

    /**
     * The wheel turns itself until either it reaches the specified angle, or it
     * finds a neighbour being capable to receive a ball from or to give a ball to.
     * 
     * @param Angle
     * @return
     */
    protected Container TurnTill(int Angle) {
        return null;

    }

    /**
     * Inserts the ball into the slot that is at the angle of the donor
     * 
     * @param donor
     * @param ball
     */
    protected void SetBall(Container donor, Ball ball) {

    }

    /**
     * Deletes the given ball from the slot it has it
     * 
     * @param ball
     */
    protected void DeleteBall(Ball ball) {

    }

    /**
     * 
     * @return the current angle.
     */
    public int GetAngle() {
        return Angle;

    }

}
