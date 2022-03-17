package com.badcode;

public class Rectangle extends AddPoints {
    @Override
    public int points(int height, int width) {
        return height*width;
    }
}