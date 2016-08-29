package com.goit.gojavaonline.enterprise.generics;


import java.util.List;

public interface Executor<E> {

    void addTask(Task<? extends E> task);

    void addTask(Task<? extends E> task, Validator<? super E> validator);

    void execute();

    List<? super E> getValidResults();

    List<? super E> getInvalidResults();
}
