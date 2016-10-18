package com.goit.gojavaonline.enterprise.collections;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        TimeChecker arrayListTimeChecker = new TimeChecker(arrayList, 100);
        List<Integer> linkedList = new LinkedList<Integer>();
        TimeChecker linkedListTimeChecker = new TimeChecker(linkedList, 100);
        Set<Integer> hashSet = new HashSet<Integer>();
        TimeChecker hashSetTimeChecker = new TimeChecker(hashSet, 100);
        Set<Integer> treeSet = new TreeSet<Integer>();
        TimeChecker treeSetTimeChecker = new TimeChecker(treeSet, 100);
        Collection<TimeChecker> timeCheckers = new ArrayList<TimeChecker>();
        timeCheckers.add(arrayListTimeChecker);
        timeCheckers.add(linkedListTimeChecker);
        timeCheckers.add(hashSetTimeChecker);
        timeCheckers.add(treeSetTimeChecker);

        for (int i = 10; i <= 1000; i = i * 10) {
            System.out.printf("%50.50s", "\nFOR " + i + "K THOUSANDS:\n");
            CollectionParametersTable collectionParametersTable = new CollectionParametersTable(timeCheckers, i);
            collectionParametersTable.printTable();
            collectionParametersTable.writeTableToFile("collections" + i + ".txt");
        }

    }
}
