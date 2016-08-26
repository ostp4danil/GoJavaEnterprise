package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;
import com.goit.gojavaonline.enterprise.generics.buildings.House;
import com.goit.gojavaonline.enterprise.generics.buildings.Restaurant;
import com.goit.gojavaonline.enterprise.generics.interfaces.Task;

import java.util.*;

public class BuildingTask implements Task <Building>{

    private List<Building> buildings;


    public void execute() {
        buildings = new ArrayList<>();
        buildings.add(new House(10,100,"Domik",3));
        buildings.add(new House(10,100,"Domik",3));
        buildings.add(new Restaurant(5,75,"Almamater",200));

    }

    public List<? extends Building> getResult() {
        return  buildings;
    }
}
