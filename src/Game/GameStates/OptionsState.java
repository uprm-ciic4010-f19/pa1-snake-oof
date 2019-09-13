package Game.GameStates;

import java.awt.Graphics;

import Main.Handler;
import Resources.Images;
import UI.UIImageButton;
import UI.UIManager;

public class OptionsState extends State {
	private int count=0;
	
	private UIManager uiManager; //Created this file to add an Options image.
	
	public OptionsState(Handler handler) {
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUimanager(uiManager);
     //   uiManager = new UIManager(handler);
     //   handler.getMouseManager().setUimanager(uiManager);

    // uiManager.addObjects(new UIImageButton(56, 223, 128, 64, Images.IMG_8010, () -> {
       //   handler.getMouseManager().setUimanager(null);
      //  }));

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
		 g.drawImage(Images.IMG_8010,0,0,800,600,null);
	        uiManager.Render(g);
		
	}
	}
