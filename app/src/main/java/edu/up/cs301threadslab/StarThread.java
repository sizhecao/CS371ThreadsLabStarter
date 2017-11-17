package edu.up.cs301threadslab;

import java.util.Random;
import java.util.Vector;

/**
 * Created by sizhecao on 11/16/17.
 */

public class StarThread extends Thread {
    /*private Vector<Star> myField = new Vector<Star>();
    public StarThread (Vector f){
         myField=f;

    }*/
    private StarAnimation mySA;
    public StarThread (StarAnimation sa){
        mySA = sa;

    }

    public void run(){

            while (1 == 1) {

                //Random ran = new Random();

                if (Math.random() < 0.5) {
                    mySA.addStar();
                } else {
                    mySA.removeStar();
                }
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {

                }


            }




    }
}
