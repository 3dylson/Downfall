package Downfallgame.BL;

/** It consists of several containers, and it sends the actors messages to the wheels. */
public class GameBoard {
    
    /** Stores game parameters (number of axles, game type, etc.) */
    protected GameParameters GameParameters;
    
    /** The current player. Game board is drawn based on this. */
    protected Player CurrPlayer;

    
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
    Boolean TurnWheel(int WheelNo, int Angle){

    }
    
}
