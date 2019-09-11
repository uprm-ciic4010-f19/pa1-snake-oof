package Game.GameStates;

import Main.Handler;
import Resources.Images;
import UI.UIImageButton;
import UI.UIManager;

import java.awt.*;

import com.sun.glass.events.KeyEvent;

/**
 * Created by AlexVR on 7/1/2018.
 */
public class PauseState extends State {

    private int count = 0;
    private UIManager uiManager;

    public PauseState(Handler handler) {
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUimanager(uiManager);

        uiManager.addObjects(new UIImageButton(56, 223, 128, 64, Images.Resume, () -> {
            handler.getMouseManager().setUimanager(null);
            State.setState(handler.getGame().gameState);
        }));

        uiManager.addObjects(new UIImageButton(56, 223+(64+16), 128, 64, Images.Options, () -> {
            handler.getMouseManager().setUimanager(null);
            State.setState(handler.getGame().menuState); //Maybe later add on options to pop up what one can do
        }));

        uiManager.addObjects(new UIImageButton(56, (223+(64+16))+(64+16), 128, 64, Images.BTitle, () -> {
            handler.getMouseManager().setUimanager(null);
            State.setState(handler.getGame().menuState);
        }));





    }

    @Override
    public void tick() {
        handler.getMouseManager().setUimanager(uiManager);
        uiManager.tick();
        count++;
        if( count>=30){
            count=30;
        }
        if(handler.getKeyManager().keyJustPressed(KeyEvent.VK_ESCAPE)){
            State.setState(handler.getGame().pauseState);
        }


    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.Pause,0,0,800,600,null);
        uiManager.Render(g);

    }
}
