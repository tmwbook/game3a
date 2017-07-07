package com.mygdx.game.utils;

import java.util.ArrayList;

/**
 * Created by Tom on 7/6/2017.
 */
public class TruthTable {

    ArrayList<TruthTableRow> rows;

    ArrayList<String> inputHeaders, outputHeaders;


    public TruthTable(){}

    public TruthTable(ArrayList<TruthTableRow> initialRows){
        rows = initialRows;
    }
}
