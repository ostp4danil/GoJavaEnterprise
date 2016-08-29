package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;

import java.util.List;


public interface Task <T> {

    void execute();

    T getResult();

}
