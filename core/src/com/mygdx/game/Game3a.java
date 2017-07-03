package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game3a extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	InputMultiplexer dispatcher; //Please don't smite me for naming it this
	public float bgRed, bgGreen, bgBlue, bgAlpha;
	
	@Override
	public void create () {
	    bgRed = 1;
	    bgGreen = 0;
	    bgBlue = 1;
	    bgAlpha = 1;
	    dispatcher = new InputMultiplexer();
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		Gdx.input.setInputProcessor(dispatcher);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(bgRed, bgGreen, bgBlue, bgAlpha);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
    }

	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
