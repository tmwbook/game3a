package com.mygdx.game.utils;

import java.util.ArrayList;

/**
 * Created by Tom on 7/7/2017.
 */
public abstract class Gate {

    TruthTable tt;

    ArrayList<Gate> inputs;

    public Gate(){}

    public Gate(ArrayList<Gate> initInput){
        inputs = initInput;
    }

    public Gate(TruthTable solved){
        tt = solved;
    }

    public Gate(ArrayList<Gate> initInput, TruthTable solved){
        inputs = initInput;
        tt = solved;
    }

    //FIXME the way this is implemented in sub classes should use the TTs (maybe observer) it will be very inefficient for now
    public abstract int getOutput();
}
