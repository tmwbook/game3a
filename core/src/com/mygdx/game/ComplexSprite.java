package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Tom on 7/3/2017.
 */
public interface ComplexSprite {


    /**
     * Internally update the sprite's fields
     * TODO(Tom): should this be for all sprites?
     */
    void update();

    int getX();

    int getY();

    Texture getTexture();
}
