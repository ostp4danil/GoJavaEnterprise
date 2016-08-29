package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;


import java.util.ArrayList;
import java.util.List;

public class BuildingExecutor implements Executor<Building> {

    private List<? extends Building> buildings = new ArrayList<>();
    private List<Task<? extends Building>> taskList = new ArrayList<>();
    private Validator<? super Building> validator;
    private List<? extends Building> validResults = new ArrayList<>();
    private List<? extends Building> invalidResults = new ArrayList<>();
    private boolean isExecuted = false;
    private boolean validatorIsExist = false;


    public void addTask(Task<? extends Building> task) {
        if (task != null) {
            taskList.add(task);
        }
    }

    public void addTask(Task<? extends Building> task, Validator<? super Building> validator) {
        if (task != null) {
            taskList.add(task);
        }
        if (!validatorIsExist) {
            this.validator = validator;
            validatorIsExist = true;
        }

    }

    public void execute() {
        if (isExecuted) {
            throw new IllegalStateException();
        }
        for (Building building : buildings) {
            if (validator.isValid(building)) {

            } else {

            }
        }
        isExecuted = true;
    }

    public List<? extends Building> getValidResults() {
        return validResults;
    }

    public List<? extends Building> getInvalidResults() {
        return invalidResults;
    }
}
