package edu.up.cs301threadslab;

/**
 * Created by sizhecao on 11/16/17.
 */

public class myThread extends Thread {
    private AnimationView myAV;
    public myThread (AnimationView av){
        myAV =av;

    }

    public void run(){
        while (1==1){
            myAV.postInvalidate();
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException e){

            }
        }


    }


}
