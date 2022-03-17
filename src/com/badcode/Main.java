package com.badcode;

public class Main {

    public static void main(String[] args) {
	Game gm = new Game();
    gm.charctercostume("red");
    gm.charctercostume("blue");
    System.out.println(gm.getPoints());
    gm.addpoints("Rectangle");
    System.out.println(gm.getPoints());
    gm.addpoints("circle");
    System.out.println(gm.getPoints());
    gm.decpoints("crow");
    gm.decpoints("dragon");
    System.out.println(gm.getPoints());
    gm.controls(Game.odevice.valueOf("keyboard"));
    gm.controls(Game.odevice.valueOf("joystick"));
    }
}
