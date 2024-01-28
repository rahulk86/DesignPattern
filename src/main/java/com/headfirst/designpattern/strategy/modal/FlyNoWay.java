package com.headfirst.designpattern.introToDesignPattern.modal;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
