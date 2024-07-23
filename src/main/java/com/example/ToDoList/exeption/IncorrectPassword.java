package com.example.ToDoList.exeption;

import io.micrometer.core.instrument.Statistic;

import java.util.function.Supplier;

public class IncorrectPassword extends RuntimeException implements Supplier<IncorrectPassword> {
    public IncorrectPassword(String message){
        super(message);
    }
     public static IncorrectPassword instance(String message){
        return new IncorrectPassword(message);
     }

     @Override
    public IncorrectPassword get(){
        return this;
     }
}
