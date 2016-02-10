package com.blox.game;

import com.badlogic.gdx.Game;
import com.blox.game.screen.GameScreen;

public class blox extends Game {
	
	// WVGA (800x480)
	public static final int gameWidth = 800;
	public static final int gameHeight = 480;

	@Override
	public void create() {
		// Temporary code. Starts the game immediately. To be changed after.
		setScreen(new GameScreen());
	}
	
}