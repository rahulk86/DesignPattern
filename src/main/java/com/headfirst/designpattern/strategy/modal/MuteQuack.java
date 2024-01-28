package com.headfirst.designpattern.introToDesignPattern.modal;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
