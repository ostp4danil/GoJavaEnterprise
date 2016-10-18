package com.goit.gojavaonline.enterprise.generics;

import com.goit.gojavaonline.enterprise.generics.buildings.Building;


public class BuildingTask implements Task <Building>{

    private Building building;

    public BuildingTask(Building building) {
        this.building = building;
    }

    public void execute() {
        building.setCapacity(building.getSquare()*building.getHeight());
    }

    public Building getResult() {
        return  building;
    }
}
