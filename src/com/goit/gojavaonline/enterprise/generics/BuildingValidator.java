package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;

public class BuildingValidator implements Validator<Building> {

    public boolean isValid(Building result) {
        if (result.getVolume()<100 && result.getSquare()<= 0 || result.getHeight()<2) {
            return false;
        }
        return true;
    }
}
