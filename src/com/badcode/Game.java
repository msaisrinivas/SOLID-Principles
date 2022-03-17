package com.badcode;

import com.goodcode.CircleInc;

/* Game class voilated SRP*/
public class Game {

    public void charctercostume(String str){
        /* charactercostume function voilated OCP*/
        if (str.equals("red")){
            System.out.println("Got Red costume");
        }
        else{
            System.out.println("Got Blue costume");
        }
    }

    private int points=0;

    public int getPoints() {
        return points;
    }
    public void addpoints(String str){
        /* addpoints function voilated LSP and OCP*/
        if (str.equals("rectangle")){
            AddPoints addrec= new Rectangle();
            addrec.glow();
            points = points+ addrec.points(4,5);
        }
        else{
            AddPoints addcir = new circle();
            addcir.glow();
        }
    }

    public void decpoints(String str){
        /* decpoints voilated ISP and OCP*/

        if(str.equals("crow")){
            bird crowbird = new crow();
            points = points - crowbird.pointsdec();
            crowbird.flames();
        }
        else{
            bird dragonbird= new dragon();
            points = points - dragonbird.pointsdec();
            dragonbird.flames();
        }
    }

    enum odevice{keyboard, joystick};
    void controls(odevice dev){
        /* Voilated the DIP*/
        if (dev== odevice.keyboard){
            keyboard key = new keyboard();
            key.move();
        }
        else{
            joystick joy = new joystick();
            joy.move();
        }
    }

}
