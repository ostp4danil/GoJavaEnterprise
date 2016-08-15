package com.goit.gojavaonline.enterprise.Collections;

import java.util.*;

/**
 * Created by Danil-MAC on 8/12/16.
 */
public class Runner {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        TimeChecker arrayListTimeChecker = new TimeChecker(arrayList, 100);
        List<Integer> linkedList = new LinkedList<>();
        TimeChecker linkedListTimeChecker = new TimeChecker(linkedList, 100);
        Set<Integer> hashSet = new HashSet<>();
        TimeChecker hashSetTimeChecker = new TimeChecker(hashSet, 100);
        Set<Integer> treeSet = new TreeSet<>();
        TimeChecker treeSetTimeChecker = new TimeChecker(treeSet, 100);
        Collection<TimeChecker> timeCheckers = new ArrayList<>();
        timeCheckers.add(arrayListTimeChecker);
        timeCheckers.add(linkedListTimeChecker);
        timeCheckers.add(hashSetTimeChecker);
        timeCheckers.add(treeSetTimeChecker);

        for (int i = 10; i <= 1000; i = i * 10) {
            System.out.println("\ngFOR " + i + " THOUSANDS: ");
            CollectionParametersTable collectionParametersTable = new CollectionParametersTable(timeCheckers, i);
            collectionParametersTable.printTable();
            collectionParametersTable.writeTableToFile("collections.txt");
        }

    }
}
