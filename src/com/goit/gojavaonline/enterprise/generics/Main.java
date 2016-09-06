package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.buildings.House;
import com.goit.gojavaonline.enterprise.generics.buildings.Office;
import com.goit.gojavaonline.enterprise.generics.buildings.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<>();
        Validator<Building> buildingValidator = new BuildingCapacityValidator(100);
        Executor<Building> buildingExecutor = new BuildingExecutor();

        buildings.add(new House(10, 120, 30, "USSR", 3));
        buildings.add(new Restaurant(3, 250, -1, "Modern", 200));
        buildings.add(new Office(1, 150, 3, "Minimalizm", 300));

        try {
            for (Building building : buildings) {
                buildingExecutor.addTask(new BuildingTask(building), buildingValidator);
            }
        } catch (IllegalStateException e) {
            System.out.println("Executor should be called first!" + e.getLocalizedMessage());
        }


        buildingExecutor.execute();
        try {
            System.out.println("Valid: " + buildingExecutor.getValidResults());
            System.out.println("Invalid: " + buildingExecutor.getInvalidResults());
        } catch (IllegalStateException e) {
            System.out.println("Executor has not been called yet!" + e.getLocalizedMessage());
        }
    }
}
