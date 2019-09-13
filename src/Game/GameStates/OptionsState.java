package Game.GameStates;

import Main.Handler;
import Resources.Images;
import UI.UIImageButton;
import UI.UIManager;

public class OptionsState extends State {
	
	private UIManager uiManager; //Created this file to add an Options image.
	
	public OptionsState(Handler handler) {
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUimanager(uiManager);

        uiManager.addObjects(new UIImageButton(56, 223, 128, 64, Images.Slide1, () -> {
            handler.getMouseManager().setUimanager(null);
        }));

}}
