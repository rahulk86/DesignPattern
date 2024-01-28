package com.headfirst.designpattern.introToDesignPattern.repository;

import com.headfirst.designpattern.introToDesignPattern.modal.Duck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DuckRepository extends JpaRepository<Duck , Long> {

}
