package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.interfaces.Executor;
import com.goit.gojavaonline.enterprise.generics.interfaces.Task;
import com.goit.gojavaonline.enterprise.generics.interfaces.Validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BuildingExecutor implements Executor<Building> {

    private List<Building> buildings = new ArrayList<>();
    private Task<? extends Building> task = new BuildingTask();
    private Validator<? super Building> validator;


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
        System.out.println("Valid: "+ getValidResults().toString());
        System.out.println("Invalid: "+ getInvalidResults().toString());
    }

    public List<? extends Building> getValidResults() {
        List<Building> validResults = new ArrayList<>();
        for (Building building : buildings) {
            if (validator.isValid(building)) {
                validResults.add(building);
            }
        }

        return validResults;
    }
        public List<? extends Building> getInvalidResults () {
            List<Building> invalidResults = new ArrayList<>();
            for (Building building : buildings) {
                if (!validator.isValid(building)) {
                    invalidResults.add(building);
                }
            }
            return invalidResults;
        }
    }
