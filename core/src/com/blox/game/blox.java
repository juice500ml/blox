package com.blox.game;

import com.badlogic.gdx.Game;
import com.blox.game.screen.GameScreen;

public class blox extends Game {

	@Override
	public void create() {
		// Temporary code. Starts the game immediately. To be changed after.
		setScreen(new GameScreen());
	}
	
}