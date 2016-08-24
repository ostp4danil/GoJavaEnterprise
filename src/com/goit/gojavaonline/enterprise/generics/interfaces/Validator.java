package com.goit.gojavaonline.enterprise.generics.interfaces;

import java.util.List;

/**
 * Created by Danil-MAC on 8/23/16.
 */
public interface Validator <T>{
    // Валидирует переданое значение
    boolean isValid(List<? extends T> result);
}
