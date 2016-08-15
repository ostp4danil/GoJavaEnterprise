package com.goit.gojavaonline.enterprise.Collections;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    public void writeTableToFile(String fileName){
        File file = new File(fileName);
            try {
                FileWriter out = new FileWriter(file);
                out.write(getColumns());
                out.write(getFields());
                out.close();
            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }

    public void printTable() {
        System.out.println(getColumns());
        System.out.println(getFields());
    }

    private String getFields() {
        StringBuffer fields = new StringBuffer();
        int i = 0;
        for (TimeChecker container : containers) {
            Formatter fieldsFormatter = new Formatter();
            fieldsFormatter.format("%10.10s",containersNames[i]);
            fieldsFormatter.format("%20.20s", container.checkPopulate(thousands));
            fieldsFormatter.format("%20.20s", container.checkGetting());
            fieldsFormatter.format("%20.20s", container.checkRemoving());
            fieldsFormatter.format("%20.20s", container.checkAdding());
            fieldsFormatter.format("%20.20s", container.checkContains());
            fieldsFormatter.format("%20.20s", container.checkIteratorAdd());
            fieldsFormatter.format("%20.20s", container.checkIteratorRemove());
            fields.append("\n");
            fields.append(fieldsFormatter.toString());
            i++;
        }
        return fields.toString();
    }

    private String getColumns() {
        Formatter columns = new Formatter();
        columns.format("%30.15s", "populate");
        columns.format("%20.15s", "get");
        columns.format("%20.15s", "remove");
        columns.format("%20.15s", "add");
        columns.format("%20.15s", "contains");
        columns.format("%20.15s", "iterator.add");
        columns.format("%20.15s", "iterator.remove");
        return columns.toString();
    }


}

