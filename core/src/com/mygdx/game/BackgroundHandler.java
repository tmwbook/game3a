package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by Tom on 7/1/2017.
 */
public class BackgroundHandler extends InputAdapter {

    Game3a context;

    public BackgroundHandler(Game3a context){
        this.context = context;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button){
        context.bgRed = 0;
        context.bgBlue = 1;
        return false;
    }
}
