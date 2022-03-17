package com.goodcode;

public class dragon implements flames{
    @Override
    public int points() {
        return 10;
    }

    @Override
    public void flamethrow() {
        System.out.println("FLAMES !!!");
    }
}
