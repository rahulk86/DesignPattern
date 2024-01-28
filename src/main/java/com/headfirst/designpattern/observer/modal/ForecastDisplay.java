package com.headfirst.designpattern.observer.modal;

import lombok.Getter;

@Getter
public class CurrentConditionDisplay implements Observer{
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject subject){
        subject.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        System.out.println("current condition : "+temp+"F degrees and "+humidity+"% humidity "+pressure +" pa");
    }
}
