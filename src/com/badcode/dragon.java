package com.badcode;

public class dragon implements bird{
    @Override
    public int pointsdec() {
        return 10;
    }

    @Override
    public void flames() {
        System.out.println("HERE TAKE THE FLAMES !!!!");
    }
}
