package com.goit.gojavaonline.enterprise.generics;


import com.goit.gojavaonline.enterprise.generics.buildings.Building;

public class BuildingValidator implements Validator<Building> {

    private int criterion;

    public BuildingValidator(int criterion) {
        this.criterion = criterion;
    }

    public boolean isValid(Building result) {
        if (result != null && result.getVolume()<criterion) {
            return false;
        }
        return true;
    }
}
