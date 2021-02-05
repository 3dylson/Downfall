package Downfallgame.BL;

import Downfallgame.PL.ContainerView;

/** Hold the balls and be able to hand over balls or to receive balls. */
public class Container {
    
    /** X position of the object on the screen. */
    protected int PosX;
    
    /** Y position of the object on the screen. */
    protected int PosY;

    /** Number of slots in this object */
    protected int NSlots;

    /** The vector of all slots, having the exact angle the slot is placed at. */
    protected int[] SlotAngle;
    
    /** This vector shows for each slot how much balls it can contain. */
    protected int[] SlotSize;


    /** Check if the Container is able to receive a ball at Angle. If it is, it accepts the ball indicated by BallNumber and returns True. Otherwise it returns False. */
    boolean Receive(Ball BallNumber, Container donor) {
        return false;
        
    }

    /** Add a slot to the container. The slot is at Angle, and able to hold Size balls. */
    public void AddSlot(Integer Angle, Integer Size) {
                
    }

    /** Accept a ball at an agle. If the neighbour (donor) is able to transfer a ball at angle, it returns the BallNumber. Otherwise it returns zero. */
    public Ball Offer(Container acceptor) {
        return null;
        
    }

    /** Draw the object on the sceen. */
    public void Draw(){

    }

    /** Add a donor at angle. If there is a ball at an slot, which is set to this angle, ball transfer from donor is initiated. */
    public void AddDonor(Container Donor, Integer Angle) {
        
    }

    /** Add an acceptor at angle. If there is a ball at an slot, which is set to this angle, ball transfer to acceptor is initiated. */
    public void AddAcceptor(Container Acceptor, Integer Angle) {
        
    }

    /** Returns a two dimensional matrix of the slots and the balls they have. */
    public Ball[NSlotNumber][] GetBalls(){
        
    }

    /**
     * This method is invoked after a view has been signed up
     * @return the non changing parameters (number of slots, their size, their angle, etc).
     */
    public Integer[] GetParameters(){

    }


    /** With this method we can attach a view to the Container, and if some change in its state occurs, the view can be notified.  */
    public void AddView (ContainerView){

    }

}
