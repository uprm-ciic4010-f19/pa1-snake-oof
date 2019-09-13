package Game.Entities.Static;
import java.awt.*;

import Game.Entities.Dynamic.Player;
import Main.Handler;

/**
 * Created by AlexVR on 7/2/2018.
 */
public class Apple {

    private Handler handler;

    public int xCoord;
    public int yCoord;
    public double score;
    public double subtract;
    public Player player;
    public Graphics g;

    public Apple(Handler handler,int x, int y){
        this.handler=handler;
        this.xCoord=x;
        this.yCoord=y;
    }
    
    public boolean isGood() {
    	if(handler.getWorld().player.steps >= 90) {
    		return false;
    	}else {
    		return true;
    	}


}}
