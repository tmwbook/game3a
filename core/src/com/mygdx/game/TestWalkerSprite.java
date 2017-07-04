package com.mygdx.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Tom on 7/3/2017.
 */
public class TestWalkerSprite extends InteractiveSprite {

    int xVel=0, yVel=0;

    public TestWalkerSprite(Texture spritePath, int initX, int initY) {
        super(spritePath, initX, initY);
    }

    @Override
    public void update(){
        xPos += xVel;
        yPos += yVel;
    }

    @Override
    public boolean keyDown(int key){
        if(key == Input.Keys.RIGHT){
            xVel += 5;
            return true;
        }else if (key == Input.Keys.LEFT){
            xVel += -5;
            return true;
        }

        return false;
    }

    @Override
    public boolean keyUp(int key){
        if(key == Input.Keys.LEFT){
            xVel += 5;
            return true;
        } else if(key == Input.Keys.RIGHT) {
            xVel += -5;
            return true;
        }
        return false;
    }

}
