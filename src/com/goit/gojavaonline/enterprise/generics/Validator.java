package com.goit.gojavaonline.enterprise.generics;

import java.util.List;

public interface Validator <T>{
    // Валидирует переданое значение
    boolean isValid(T result);
}
