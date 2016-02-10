package com.blox.game.helper;

import com.badlogic.gdx.Gdx;

/**
 * Updating the internal states of objects in game
 */
public class GameWorld {

	public void update(float delta) {
		Gdx.app.log(this.toString(), "Frame Rate: " + Integer.toString((int)(1/delta)));
	}
}
