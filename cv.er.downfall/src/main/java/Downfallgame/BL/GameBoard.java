package Downfallgame.BL;

import java.util.ArrayList;
import java.util.List;

/**
 * It consists of several containers, and it sends the actors messages to the
 * wheels.
 */
public class GameBoard {
    
    /** Stores game parameters (number of axles, game type, etc.) */
    protected GameParameters GameParameters;// TODO GameParameters Class
    
    
    /** The current player. Game board is drawn based on this. */
    protected Player CurrPlayer;// TODO Player Class

    public List<Axle> m_Axle;
    public GameType type;
    public Storage m_Storage;
    public Collector m_Collector;
    

    public GameBoard(){}
    
    /** Start a new game. Initialize game objects. */
    public void NewGame() {
        
    }

    /** Collector calls Game Over, if the game is finished. The winner player is indicated. */
    public void GameOver(Boolean WinOrLoose) {

    }

    /** Configure game parameters. */
    public void ConfigureGame(){
        

    }

    /** User input to turn the wheel to Angle. Returns False if not successful. */
    public Boolean TurnWheel(int WheelNo, int Angle){

    }
    
}
