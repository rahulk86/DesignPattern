package com.headfirst.designpattern.introToDesignPattern.modal;


import jakarta.persistence.Entity;

@Entity
public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("i am model duck");
    }
}
