package com.mygdx.game;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Tom on 7/1/2017.
 */
public class BackgroundHandler extends InputAdapter {

    Game3a context;

    public BackgroundHandler(Game3a context){
        this.context = context;
        context.centralDispatcher.addProcessor(this);
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button){
        Vector3 v = new Vector3();
        context.cam.unproject(v.set(screenX, screenY, 0));

        context.bgRed = 0;
        context.bgBlue = 1;
        return true;
    }
}
