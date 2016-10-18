package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.buildings.House;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ValidatorTest {

    private  Validator<? super Building> buildingValidator;

    @Before
    public void setUp() throws Exception {
        buildingValidator = new BuildingCapacityValidator(100);
    }

    @Test
    public void validator_WhenIncorrectDatasThenFalse(){
        buildingValidator.isValid(new House(-20, -30, 50, "Dom", 0));
        Assert.assertEquals(buildingValidator.isValid(new House(-20, -30, 12, "Dom", 0)),false);
    }


}
