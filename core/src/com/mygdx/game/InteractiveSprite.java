package com.mygdx.game;

import java.io.File;

/**
 * Created by Tom on 7/3/2017.
 */
public class InteractiveSprite implements ComplexSprite {

    File spritePath;

    public InteractiveSprite(File spritePath){
        this.spritePath = spritePath;
    }
}
