package com.headfirst.designpattern.introToDesignPattern.service.Impl;

import com.headfirst.designpattern.introToDesignPattern.modal.*;
import com.headfirst.designpattern.introToDesignPattern.repository.DuckRepository;
import com.headfirst.designpattern.introToDesignPattern.service.DuckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuckServiceImpl implements DuckService {

    @Autowired
    private  DuckRepository duckRepository;
    @Override
    public Duck getDuckById(Long id) {
       Duck duck = duckRepository
                     .findById(id)
                     .orElse(null);

       if(duck==null){
           throw new RuntimeException("");
       }

       if(duck.getAge().getYears()==0 && duck.getAge().getMonths()<2){
           duck.setFlyBehavior(new FlyNoWay());
       }else if(duck.getAge().getYears()==0  && duck.getAge().getDays()<4){
           duck.setFlyBehavior(new FlyWithWings());
       }

       if (duck.getAge().getYears()==0 && duck.getAge().getMonths() < 1) {
            duck.setQuackBehavior(new MuteQuack());
       } else if (duck.getAge().getYears()==0 && duck.getAge().getMonths() < 2) {
            duck.setQuackBehavior(new Quack());
       } else {
            duck.setQuackBehavior(new Squeak());
       }

        return duck;
    }

    @Override
    public Duck createNewDuck(Duck duck) {
        return duckRepository.save(duck);
    }
}
