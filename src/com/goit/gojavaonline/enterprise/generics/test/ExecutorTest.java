package com.goit.gojavaonline.enterprise.generics.test;


import com.goit.gojavaonline.enterprise.generics.BuildingExecutor;
import com.goit.gojavaonline.enterprise.generics.BuildingTask;
import com.goit.gojavaonline.enterprise.generics.BuildingValidator;
import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.buildings.House;
import com.goit.gojavaonline.enterprise.generics.interfaces.Executor;
import com.goit.gojavaonline.enterprise.generics.interfaces.Task;
import com.goit.gojavaonline.enterprise.generics.interfaces.Validator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExecutorTest {

    private Executor<Building> buildingExecutor;
    private Validator<Building> buildingValidator;
    private Task<Building> buildingTask;

    @Before
    public void setUp() throws Exception {
        buildingExecutor = new BuildingExecutor();
        buildingValidator = new BuildingValidator();
        buildingTask = new BuildingTask();
    }


    @Test(expected = IllegalStateException.class)
    public void executeTest_When_IsNotExecuted_Then_Exception(){
        buildingExecutor.addTask(buildingTask, buildingValidator);
        buildingExecutor.getInvalidResults();

    }

    @Test
    public void validatorTest(){
        buildingValidator.isValid(new House(-20, -30, "Dom", 0));
        Assert.assertEquals(buildingValidator.isValid(new House(-20, -30, "Dom", 0)),false);

    }

}
