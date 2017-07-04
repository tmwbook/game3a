package com.mygdx.game;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Texture;

import java.io.File;

/**
 * Created by Tom on 7/3/2017.
 */
public class InteractiveSprite extends InputAdapter implements ComplexSprite {

    Texture spritePath;
    protected int xPos, yPos;

    public InteractiveSprite(Texture spritePath, int initX, int initY){
        xPos = initX;
        yPos = initY;
        this.spritePath = spritePath;
    }

    @Override
    public void update() {

    }

    @Override
    public int getX() {
        return xPos;
    }

    @Override
    public int getY() {
        return yPos;
    }

    @Override
    public Texture getTexture() {
        return spritePath;
    }
}
