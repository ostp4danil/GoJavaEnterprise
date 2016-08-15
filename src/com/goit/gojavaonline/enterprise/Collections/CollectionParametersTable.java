package com.goit.gojavaonline.enterprise.Collections;


import java.util.Collection;
import java.util.Formatter;

public class CollectionParametersTable {

    private Collection<TimeChecker> containers;
    private final int thousands;
    private String[] containersNames = new String[]{"ArrayList", "LinkedList", "HashSet", "HashMap"};

    public CollectionParametersTable(Collection<TimeChecker> containers, int thousands) {
        this.containers = containers;
        this.thousands = thousands;
    }


    public void printTable() {
        printColumns();
        printFields();
    }

    private void printFields() {
        int i = 0;
        for (TimeChecker container : containers) {
            Formatter fields = new Formatter();
            fields.format("%10.10s",containersNames[i]);
            fields.format("%20.20s", container.checkPopulate(thousands));
            fields.format("%20.20s", container.checkAdding());
            fields.format("%20.20s", container.checkGetting());
            fields.format("%20.20s", container.checkRemoving());
            fields.format("%20.20s", container.checkContains());
            fields.format("%20.20s", container.checkIteratorAdd());
            fields.format("%20.20s", container.checkIteratorRemove());
            System.out.println(fields);
            i++;
        }

    }

    private void printColumns() {
        Formatter columns = new Formatter();
        columns.format("%30.15s", "add");
        columns.format("%20.15s", "get");
        columns.format("%20.15s", "remove");
        columns.format("%20.15s", "contains");
        columns.format("%20.15s", "populate");
        columns.format("%20.15s", "iterator.add");
        columns.format("%20.15s", "iterator.remove");
        System.out.println(columns);
    }


}

