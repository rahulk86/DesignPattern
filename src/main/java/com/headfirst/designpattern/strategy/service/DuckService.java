package com.headfirst.designpattern.introToDesignPattern.service;

import com.headfirst.designpattern.introToDesignPattern.modal.Duck;

public interface DuckService {
    Duck getDuckById(Long id);
    Duck createNewDuck(Duck duck);

}
