package com.mygdx.game.utils;

/**
 * Created by Tom on 7/7/2017.
 */
public class AndGate extends Gate{

    public AndGate(){
    }

    @Override
    public int getOutput() {
        for(Gate input : inputs){
            if(input.getOutput() == 0){
                return 0;
            }
        }
        return 1;
    }
}
