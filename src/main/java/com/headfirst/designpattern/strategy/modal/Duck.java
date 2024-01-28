package com.headfirst.designpattern.introToDesignPattern.modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.Period;

@Getter
@Setter
@Entity
public abstract class Duck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double weight;
    private String name;
    private LocalDateTime birthdate;
    private String size;
    private String health;
    @Embedded
    private QuackBehaviour quackBehavior;
    @Embedded
    private FlyBehaviour flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

    public Period getAge(){
        LocalDateTime now = LocalDateTime.now();
        return Period.between(birthdate.toLocalDate(), now.toLocalDate());
    }
    public void swim() {
        System.out.println("i am swimming .... ");
    }

}
