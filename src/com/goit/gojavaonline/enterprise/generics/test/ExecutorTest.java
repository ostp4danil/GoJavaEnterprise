package com.goit.gojavaonline.enterprise.generics.test;


import com.goit.gojavaonline.enterprise.generics.BuildingExecutor;
import com.goit.gojavaonline.enterprise.generics.BuildingTask;
import com.goit.gojavaonline.enterprise.generics.BuildingValidator;
import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.buildings.House;
import com.goit.gojavaonline.enterprise.generics.Executor;
import com.goit.gojavaonline.enterprise.generics.Task;
import com.goit.gojavaonline.enterprise.generics.Validator;
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
        buildingTask = new BuildingTask(new House(10, 20, 30, "HaiTak", 50));
    }


    @Test(expected = IllegalStateException.class)
    public void executeTest_When_IsNotExecuted_Then_Exception(){
        buildingExecutor.addTask(buildingTask, buildingValidator);
        buildingExecutor.getInvalidResults();
    }


}
