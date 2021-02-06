package Downfallgame;

import javax.mvc.security.Csrf;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import Downfallgame.BL.Axle;
import Downfallgame.BL.GameBoard;
import Downfallgame.BL.Storage;
import Downfallgame.BL.Wheel;

import java.util.HashMap;
import java.util.Map;

@ApplicationPath("app")
public class App extends Application {
    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> props = new HashMap<>();
        props.put(Csrf.CSRF_PROTECTION, Csrf.CsrfOptions.EXPLICIT);
        return props;
        
    }

public static void main(String[] args) {

    
    Wheel wheel = new Wheel(); 

    Axle GameBoard = new Axle();
    GameBoard.AddWheel(wheel);

    

    // public void WheelNumber(wheel Integer) {
        
        
    // }

    // public void TurnAngle (angle Integer) {
        
    // }

    // public void EndTurn() {
        
    // }


    
}

}