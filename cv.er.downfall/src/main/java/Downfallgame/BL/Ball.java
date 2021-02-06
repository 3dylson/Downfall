package Downfallgame.BL;

/** Holding the information about the ball’s number and color. */
public class Ball {
   
    /** Number of ball. */
    private int number;
    
    /** Color of Ball. */
    private int colour;

    public Container Container;

    /**
    * 
     * @return the ball’s number.
     */
    public int getNumber() {
        return number;
        
    }

    public void setNumber(int number){
        this.number = number;
    }

    /**
     * 
     * @return the ball’s colour.
     */
    public int getColour() {
        return colour;
    }

    public void setColour(int colour){
        this.colour = colour;
    }
        
    
}
