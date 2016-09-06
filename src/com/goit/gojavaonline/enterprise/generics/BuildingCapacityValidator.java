package com.goit.gojavaonline.enterprise.generics;


import com.goit.gojavaonline.enterprise.generics.buildings.Building;

public class BuildingCapacityValidator implements Validator<Building> {

    private int criterion;

    public BuildingCapacityValidator(int criterion) {
        this.criterion = criterion;
    }

    public boolean isValid(Building result) {
        if (result != null && result.getCapacity()<criterion) {
            return false;
        }
        return true;
    }
}
