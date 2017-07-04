package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.MainMenuScreen;

public class Game3a extends Game {
	/**
	 * Most of these public fields are things that should probably have
	 * access management but that is something I'll need to spend some time
	 * thinking about.
	 *
	 * I can either pass things to screens and let them handle it or I can
	 * pull the screens out of a package (which is basically making this stuff
	 * public)
	 */
	public SpriteBatch batch;
	Texture img;
	public InputMultiplexer centralDispatcher; //Please don't smite me for naming it this
	public InputMultiplexer spriteDispatcher;
	public OrthographicCamera cam;

	public float bgRed=1, bgGreen, bgBlue=1, bgAlpha;
	
	@Override
	public void create () {
		cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    centralDispatcher = new InputMultiplexer();
	    spriteDispatcher = new InputMultiplexer();
	    /*
		BackgroundHandler test = new BackgroundHandler(this);
	    centralDispatcher.addProcessor(spriteDispatcher);
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		bgRed = 1;
		bgGreen = 0;
		bgBlue = 1;
		bgAlpha = 1;
		 */
	    batch = new SpriteBatch();
		Gdx.input.setInputProcessor(centralDispatcher);
		setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
    }

	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
