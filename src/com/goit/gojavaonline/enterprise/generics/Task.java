package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;

import java.util.List;


public interface Task <E> {

    void execute();

    E getResult();

}
