package com.goit.gojavaonline.enterprise.generics.interfaces;

import java.util.List;

public interface Validator <E>{
    // Валидирует переданое значение
    boolean isValid(E result);
}
