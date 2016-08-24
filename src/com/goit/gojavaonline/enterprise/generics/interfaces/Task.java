package com.goit.gojavaonline.enterprise.generics.interfaces;

import java.util.List;

/**
 * Created by Danil-MAC on 8/23/16.
 */
public interface Task <T> {

    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    <T>List<T> getResult();

}
