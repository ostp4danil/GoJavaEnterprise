package com.goit.gojavaonline.enterprise.generics.test;

import com.goit.gojavaonline.enterprise.generics.BuildingTask;
import com.goit.gojavaonline.enterprise.generics.Task;
import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.buildings.Office;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danil-MAC on 8/29/16.
 */
public class TaskTest {
    private Task<? extends Building> buildingTask;
    private List<Building> buildings = new ArrayList<>();


    @Test(expected = NullPointerException.class)
    public void execute_whenTransmitsNullThenException(){
        buildingTask = new BuildingTask(buildings.iterator().next());
    }

    @Test
    public void task_whenSquare10ThenVolume100(){
        buildingTask = new BuildingTask(new Office(10,10,10,"test",10));
        double result = buildingTask.getResult().getVolume();
        Assert.assertEquals(100,result);
    }
}
