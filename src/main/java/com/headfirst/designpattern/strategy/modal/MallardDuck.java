package com.headfirst.designpattern.introToDesignPattern.modal;

import jakarta.persistence.Entity;

@Entity
public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("i am a real Mallard duck");
    }
}
