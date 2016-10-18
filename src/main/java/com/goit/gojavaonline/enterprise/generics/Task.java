package com.goit.gojavaonline.enterprise.generics;


public interface Task <T> {

    void execute();

    T getResult();

}
