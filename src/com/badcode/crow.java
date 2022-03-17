package com.badcode;

public class crow implements bird{
    @Override
    public int pointsdec() {
        return 5;
    }

    @Override
    public void flames() {
        System.out.println("NOT USING !! BECAUSE I CAN'T THROW FLAMES :((");
    }
}
