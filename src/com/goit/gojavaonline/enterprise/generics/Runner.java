package com.goit.gojavaonline.enterprise.generics;

import java.util.List;

/**
 * Created by Danil-MAC on 8/23/16.
 */
public class Runner {

    public interface Executor {

        // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
        // Бросает Эксепшн если уже был вызван метод execute()
        void addTask(Task task);

        // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults если validator.isValid вернет true для этого результата
        // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
        // Бросает Эксепшн если уже был вызван метод execute()
        void addTask(Task task, Validator validator);

        // Выполнить все добавленые таски
        void execute();

        // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
        List getValidResults();

        // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
        List getInvalidResults();

    }

    public interface Task {

        // Метода запускает таск на выполнение
        void execute();

        // Возвращает результат выполнения
        Object getResult();


    }

    public interface Validator {

        // Валидирует переданое значение
        boolean isValid(Object result);

    }
}
