package com.mygdx.game.utils;

/**
 * Created by Tom on 7/7/2017.
 */
public class Circuit {

    /*
    A -------------&&=-----!=-
                   |    |     |
    B ------------- -!=-O=----O=-----=Q1
                            |
    C ----------------------&=-------=Q0

    Q1 = ( !(A && B) || ( A && B || !B) )
    Q0 = ( C && ( A && B || !B) )
     */

    public Circuit(){

    }
}
