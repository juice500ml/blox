package com.blox.game.helper;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.blox.game.blox;

/**
 * Rendering the screen
 */
public class GameRenderer {

	private GameWorld world;
	private OrthographicCamera camera;
	
	public GameRenderer(GameWorld gameWorld) {		
		this.world = gameWorld;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(true, blox.gameWidth, blox.gameHeight);
	}
	
	public void render() {
		
	}
}
