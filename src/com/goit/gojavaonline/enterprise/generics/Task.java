package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;

import java.util.List;


public interface Task <E> {

    // Метод запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    E getResult();

}
