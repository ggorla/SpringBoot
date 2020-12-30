package com.springlifecycle.demo;

public class Tea implements IHotDrink{

    @Override
    public void preapareHotDrink() {
        System.out.printf("We are preparing Tea for you");
    }
}
