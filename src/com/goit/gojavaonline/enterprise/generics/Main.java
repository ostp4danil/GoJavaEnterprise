package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.interfaces.Executor;
import com.goit.gojavaonline.enterprise.generics.interfaces.Task;
import com.goit.gojavaonline.enterprise.generics.interfaces.Validator;

/**
 * Created by Danil-MAC on 8/26/16.
 */
public class Main {
    public static void main(String[] args) {
        Task<Building> buildingTask = new BuildingTask();
        Validator<Building> buildingValidator = new BuildingValidator();
        Executor<Building> buildingExecutor = new BuildingExecutor();
        buildingExecutor.addTask(buildingTask, buildingValidator);
        buildingExecutor.execute();
    }
}
