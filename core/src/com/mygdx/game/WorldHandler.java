package com.mygdx.game;

import com.badlogic.gdx.InputAdapter;

/**
 * Created by Tom on 7/3/2017.
 */
public class WorldHandler extends InputAdapter{
    /**'
     * This will handle all non-sprite related events
     * Depending on the complexity this may require a refactor to be another multiplexer
     */

    public WorldHandler(){

    }

    /**
     * This should always return true
     * @param screenX x pos of the event
     * @param screenY y pos of the event
     * @param pointer "The pointer for the event"
     * @param button "the button"
     * @return true always
     */
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button){
        return true;
    }
}
