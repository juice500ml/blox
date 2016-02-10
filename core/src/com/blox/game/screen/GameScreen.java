package com.blox.game.screen;

import com.badlogic.gdx.Screen;
import com.blox.game.helper.*;

public class GameScreen implements Screen {
	
	private GameWorld gameWorld;
	private GameRenderer gameRenderer;

	public GameScreen() {
		super();
		gameWorld = new GameWorld();
		gameRenderer = new GameRenderer(gameWorld);
	}
	
	@Override
	public void show() {
	}

	@Override
	public void render(float delta) {
		gameWorld.update(delta);
		gameRenderer.render();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}

}
