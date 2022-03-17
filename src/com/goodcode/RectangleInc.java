package com.goodcode;

public class RectangleInc extends PointsInc implements glowpoint{

    @Override
    public int points(int height,int width) {
        return height * width;
    }
}
