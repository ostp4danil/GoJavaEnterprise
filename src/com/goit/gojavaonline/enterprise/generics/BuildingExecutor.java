package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.interfaces.Executor;
import com.goit.gojavaonline.enterprise.generics.interfaces.Task;
import com.goit.gojavaonline.enterprise.generics.interfaces.Validator;

import java.util.ArrayList;
import java.util.List;

public class BuildingExecutor implements Executor<Building> {

    private List<Building> buildings = new ArrayList<>();
    private Task<? extends Building> task = new BuildingTask();
    private Validator<? super Building> validator;
    private List<Building> validResults = new ArrayList<>();
    private List<Building> invalidResults = new ArrayList<>();
    private boolean isExecuted = false;


    public void addTask(Task<? extends Building> task) {
        this.task = task;
        task.execute();
        buildings.addAll(task.getResult());
    }

    public void addTask(Task<? extends Building> task, Validator<? super Building> validator) {
        this.task = task;
        task.execute();
        buildings.addAll(task.getResult());
        this.validator = validator;
    }

    public void execute() {
        if (isExecuted) {
            throw new IllegalStateException();
        }
        for (Building building : buildings) {
            if (validator.isValid(building)) {
                validResults.add(building);
            } else {
                invalidResults.add(building);
            }
        }
        isExecuted = true;
    }

    public List<? extends Building> getValidResults() {
        if (!isExecuted) {
            throw new IllegalStateException();
        }
        return validResults;
    }

    public List<? extends Building> getInvalidResults() {
        if (!isExecuted) {
            throw new IllegalStateException();
        }
        return invalidResults;
    }
}
