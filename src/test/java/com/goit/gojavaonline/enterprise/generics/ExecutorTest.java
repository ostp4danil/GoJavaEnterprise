package com.goit.gojavaonline.enterprise.generics;


import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.buildings.House;
import org.junit.Before;
import org.junit.Test;

public class ExecutorTest {

    private Executor<Building> buildingExecutor;
    private Validator<Building> buildingValidator;
    private Task<Building> buildingTask;

    @Before
    public void setUp() throws Exception {
        buildingExecutor = new BuildingExecutor();
        buildingValidator = new BuildingCapacityValidator(100);
        buildingTask = new BuildingTask(new House(10, 20, 30, "HaiTak", 50));
    }


    @Test(expected = Exception.class)
    public void execute_WhenIsNotExecutedThenIllegalStateException(){
        buildingExecutor.addTask(buildingTask, buildingValidator);
        buildingExecutor.getInvalidResults();
    }




}
