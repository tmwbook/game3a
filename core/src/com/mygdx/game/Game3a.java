package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game3a extends Game {
	SpriteBatch batch;
	Texture img;
	InputMultiplexer centralDispatcher; //Please don't smite me for naming it this
	InputMultiplexer spriteDispatcher;
	OrthographicCamera cam;

	public float bgRed, bgGreen, bgBlue, bgAlpha;
	
	@Override
	public void create () {
		cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    bgRed = 1;
	    bgGreen = 0;
	    bgBlue = 1;
	    bgAlpha = 1;
	    centralDispatcher = new InputMultiplexer();
	    spriteDispatcher = new InputMultiplexer();
		BackgroundHandler test = new BackgroundHandler(this);
	    centralDispatcher.addProcessor(spriteDispatcher);
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		Gdx.input.setInputProcessor(centralDispatcher);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(bgRed, bgGreen, bgBlue, bgAlpha);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(new Texture("professional.png"), 0, 0);
		batch.end();
    }

	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
