package com.goit.gojavaonline.enterprise.Collections;

import java.util.*;

/**
 * Created by Danil-MAC on 8/12/16.
 */
public class Runner {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        TimeChecker arrayListTimeChecker = new TimeChecker(arrayList);
        List<Integer> linkedList = new LinkedList<>();
        TimeChecker linkedListTimeChecker = new TimeChecker(linkedList);
        Set<Integer> hashSet = new HashSet<>();
        TimeChecker hashSetTimeChecker = new TimeChecker(hashSet);
        Set<Integer> treeSet = new TreeSet<>();
        TimeChecker treeSetTimeChecker = new TimeChecker(treeSet);

        hashSet.remove(5);
        arrayList.remove((Object)6);

        Collection<TimeChecker> timeCheckers = new ArrayList<>();
        timeCheckers.add(arrayListTimeChecker);
        timeCheckers.add(linkedListTimeChecker);
        timeCheckers.add(hashSetTimeChecker);
        timeCheckers.add(treeSetTimeChecker);

        CollectionParametersTable collectionParametersTable = new CollectionParametersTable(timeCheckers, 10);
        collectionParametersTable.printTable();
    }

}
