package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;


import java.util.ArrayList;
import java.util.List;

public class BuildingExecutor implements Executor<Building> {

    private List<Task<? extends Building>> taskList = new ArrayList<>();
    private Validator<? super Building> validator;
    private List<? super Building> validResults = new ArrayList<>();
    private List<? super Building> invalidResults = new ArrayList<>();
    private boolean isExecuted = false;
    private boolean validatorIsExist = false;


    public void addTask(Task<? extends Building> task) {
        if (task != null || isExecuted) {
            taskList.add(task);
        } else throw new IllegalStateException();
    }

    public void addTask(Task<? extends Building> task, Validator<? super Building> validator) {
        if (!validatorIsExist) {
            this.validator = validator;
            validatorIsExist = true;
        }
        addTask(task);
    }

    public void execute() {
        if (isExecuted) {
            throw new IllegalStateException();
        }
        for (Task<? extends Building> task : taskList) {
            task.execute();
            if (validator.isValid(task.getResult())) {
                validResults.add(task.getResult());
            } else {
                invalidResults.add(task.getResult());
            }
        }
        isExecuted = true;
    }

    public List<? super Building> getValidResults() {
        return validResults;
    }

    public List<? super Building> getInvalidResults() {
        return invalidResults;
    }
}
