package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.BackgroundHandler;
import com.mygdx.game.ComplexSprite;
import com.mygdx.game.Game3a;
import com.mygdx.game.TestWalkerSprite;

import java.util.HashSet;

/**
 * Created by Tom on 7/3/2017.
 */
public class MainMenuScreen extends ScreenAdapter {

    private HashSet<ComplexSprite> sprites;
    Game3a context;
    TestWalkerSprite testSprite;
    InputMultiplexer menuDispatcher;

    public MainMenuScreen(Game3a context){
        sprites = new HashSet<ComplexSprite>();
        this.context = context;
        testSprite = new TestWalkerSprite(new Texture("professional.png"), 0, 0);
        menuDispatcher = new InputMultiplexer();
        sprites.add(testSprite);
        menuDispatcher.addProcessor(testSprite);
        menuDispatcher.addProcessor(new BackgroundHandler(context));
        Gdx.input.setInputProcessor(menuDispatcher);
        context.cam.position.set(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2, .5f);
    }

    /**
     * Modify the sprite list for the screen
     * @param add if this is an addition operation
     * @param element the sprite involved in the operation
     * @return if the operation was successful
     */
    public boolean modifySpriteList(boolean add, ComplexSprite element){
        if(add){
            return sprites.add(element);
        }
        return sprites.remove(element);
    }

    @Override
    public void render(float delta){
        context.cam.update();
        context.batch.setProjectionMatrix(context.cam.combined);
        Gdx.gl.glClearColor(context.bgRed, 0, context.bgBlue, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        context.batch.begin();
        for(ComplexSprite sprite : sprites){
            sprite.update();
            context.batch.draw(sprite.getTexture(), sprite.getX(), sprite.getY());
        }
        context.batch.end();

    }
}
