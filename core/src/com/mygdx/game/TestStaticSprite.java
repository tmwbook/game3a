package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Tom on 7/5/2017.
 */
public class TestStaticSprite implements ComplexSprite {

    private Texture sprite;
    private int x, y;

    public TestStaticSprite(Texture file, int startX, int startY){
        sprite = file;
        x = startX;
        y = startY;
    }

    /**
     * Static sprites should not move independently
     */
    @Override
    public void update() {

    }

    @Override
    public int getX() {
        return x + (sprite.getWidth() / 2);
    }

    @Override
    public int getY() {
        return y + (sprite.getHeight() / 2);
    }

    @Override
    public Texture getTexture() {
        return sprite;
    }
}
