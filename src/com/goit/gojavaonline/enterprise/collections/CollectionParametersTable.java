package com.goit.gojavaonline.enterprise.collections;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Formatter;

public class CollectionParametersTable {

    private Collection<TimeChecker> timeCheckers;
    private final int thousands;
    private String[] containersNames = new String[]{"ArrayList", "LinkedList", "HashSet", "HashMap"};

    public CollectionParametersTable(Collection<TimeChecker> timeCheckers, int thousands) {
        this.timeCheckers = timeCheckers;
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
        StringBuilder fields = new StringBuilder();
        int i = 0;
        for (TimeChecker timeChecker : timeCheckers) {
            Collection container = timeChecker.getCollection();
            Formatter fieldsFormatter = new Formatter();
            fieldsFormatter.format("%10.10s",container.getClass().getSimpleName());
            fieldsFormatter.format("%20.20s", timeChecker.checkPopulate(thousands));
            fieldsFormatter.format("%20.20s", timeChecker.checkGetting());
            fieldsFormatter.format("%20.20s", timeChecker.checkRemoving());
            fieldsFormatter.format("%20.20s", timeChecker.checkAdding());
            fieldsFormatter.format("%20.20s", timeChecker.checkContains());
            fieldsFormatter.format("%20.20s", timeChecker.checkIteratorAdd());
            fieldsFormatter.format("%20.20s", timeChecker.checkIteratorRemove());
            fields.append("\n");
            fields.append(fieldsFormatter.toString());
            i++;
        }
        return fields.toString();
    }

    private String getColumns() {
        Formatter columns = new Formatter();
        columns.format("%10.10s", "Container");
        columns.format("%20.15s", "populate");
        columns.format("%20.15s", "get");
        columns.format("%20.15s", "remove");
        columns.format("%20.15s", "add");
        columns.format("%20.15s", "contains");
        columns.format("%20.15s", "iterator.add");
        columns.format("%20.15s", "iterator.remove");
        return columns.toString();
    }


}

