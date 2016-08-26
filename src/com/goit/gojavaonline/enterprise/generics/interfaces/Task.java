package com.goit.gojavaonline.enterprise.generics.interfaces;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;

import java.util.List;

/**
 * Created by Danil-MAC on 8/23/16.
 */
public interface Task <E> {

    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    List<? extends E> getResult();

}
