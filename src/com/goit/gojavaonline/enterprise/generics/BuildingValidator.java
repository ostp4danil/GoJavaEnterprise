package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.interfaces.Validator;
import sun.jvm.hotspot.utilities.CStringUtilities;


import java.util.List;

public class BuildingValidator implements Validator<Building> {

    public boolean isValid(Building result) {
        if (result.getAge() < 0 || result.getSquare() < 0) {
            return false;
        }
        return true;
    }
}
