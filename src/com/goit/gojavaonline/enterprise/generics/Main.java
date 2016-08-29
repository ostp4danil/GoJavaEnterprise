package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.buildings.House;
import com.goit.gojavaonline.enterprise.generics.buildings.Office;
import com.goit.gojavaonline.enterprise.generics.buildings.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task<? extends Building>> buildingTasks = new ArrayList<>();
        List<Building> buildings = new ArrayList<>();
        Validator<Building> buildingValidator = new BuildingValidator();
        Executor<Building> buildingExecutor = new BuildingExecutor();

        buildings.add(new House(10,120,30,"USSR",3));
        buildings.add(new Restaurant(3,250,-1,"Modern",200));
        buildings.add(new Office(1,150,3,"Minimalizm",300));

        for (Building building : buildings) {
            buildingExecutor.addTask(new BuildingTask(building),buildingValidator);
        }


        buildingExecutor.execute();
        System.out.println("Valid: " + buildingExecutor.getValidResults());
        System.out.println("Invalid: " + buildingExecutor.getInvalidResults());
    }
}
