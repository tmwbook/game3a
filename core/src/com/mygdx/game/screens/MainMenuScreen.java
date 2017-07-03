package com.mygdx.game.screens;

import com.badlogic.gdx.ScreenAdapter;
import com.mygdx.game.ComplexSprite;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Tom on 7/3/2017.
 */
public class MainMenuScreen extends ScreenAdapter {

    private HashSet<ComplexSprite> sprites;

    public MainMenuScreen(){
        sprites = new HashSet<ComplexSprite>();
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

        //TODO add context to class
        for(ComplexSprite sprite : sprites){
            sprite.update();
            //TODO add drawing
        }

    }
}
