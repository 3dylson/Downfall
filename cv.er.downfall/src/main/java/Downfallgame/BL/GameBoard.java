package Downfallgame.BL;

import java.util.List;

/**
 * It consists of several containers, and it sends the actors messages to the
 * wheels.
 */
public class GameBoard {

    /** Stores game parameters (number of axles, game type, etc.) */
    protected GameParameters gameParameters;
    /** The current player. Game board is drawn based on this. */
    protected Player currPlayer;

    public List<Axle> m_Axle;
    public List<GameType> type;
    public List<Storage> m_Storage;
    public List<Collector> m_Collector;

    public GameBoard(GameParameters gameParameters, Player curPlayer, Axle mAxle, GameType type, Storage mStorage,
            Collector mCollector) {
        this.gameParameters = gameParameters;
        this.currPlayer = curPlayer;

    }

    /** Start a new game. Initialize game objects. */
    public void NewGame() {

    }

    /**
     * Collector calls Game Over, if the game is finished. The winner player is
     * indicated.
     */
    public void GameOver(Boolean WinOrLoose) {

    }

    /** Configure game parameters. */
    public void ConfigureGame() {

    }

    /** User input to turn the wheel to Angle. Returns False if not successful. */
    public Boolean TurnWheel(int WheelNo, int Angle) {
        return null;

    }

}
