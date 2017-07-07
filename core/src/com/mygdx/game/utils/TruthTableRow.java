package com.mygdx.game.utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by Tom on 7/6/2017.
 */
public class TruthTableRow {

    private ArrayList<Integer> input;
    private ArrayList<Integer> output;

    public TruthTableRow(){}

    public ArrayList<Integer> getOutput() {
        return output;
    }

    public void setOutput(ArrayList<Integer> output) {
        this.output = output;
    }

    public ArrayList<Integer> getInput() {
        return input;
    }

    public void setInput(ArrayList<Integer> input) {
        this.input = input;
    }
}
