package com.goit.gojavaonline.enterprise.Collections;

import org.omg.CORBA.Object;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by Danil-MAC on 8/13/16.
 */
public class TimeChecker {

    private Collection<Integer> collection;
    private Random random = new Random(Integer.MAX_VALUE);

    public TimeChecker(Collection<Integer> collection) {
        this.collection = collection;
    }


    public long checkPopulate(final int numberOfThousands) {
        final long start = System.nanoTime();
        final int THOUSAND = 1000;
        for (int i = 0; i <= numberOfThousands * THOUSAND; i++) {
            collection.add(random.nextInt(THOUSAND*numberOfThousands));
        }
        final long end = System.nanoTime();
        return end - start;
    }

    public long checkGetting() {
        try {
            final long start = System.nanoTime();
            ((List<Integer>) collection).get(random.nextInt(collection.size()));
            final long end = System.nanoTime();
            return end - start;
        } catch (ClassCastException e) {
            return 0;
        }
    }

    public long checkAdding() {
        final long start = System.nanoTime();
        collection.add(random.nextInt());
        final long end = System.nanoTime();
        return end - start;
    }

    public long checkRemoving() {
        int removingElement = random.nextInt(collection.size());
        final long start = System.nanoTime();
        System.out.print(collection.contains(removingElement));
        collection.remove(removingElement);
        System.out.println(removingElement);
        final long end = System.nanoTime();
        return end - start;
    }

    public long checkContains() {
        final long start = System.nanoTime();
        collection.contains(random.nextInt());
        final long end = System.nanoTime();
        return end - start;
    }

    public long checkIteratorAdd() {
        try {
            final long start = System.nanoTime();
            ((List<Integer>) collection).listIterator().add(random.nextInt());
            final long end = System.nanoTime();
            return end - start;
        } catch (ClassCastException e) {
            return 0;
        }
    }

    public long checkIteratorRemove() {
        try {
            ListIterator listIterator = ((List<Integer>) collection).listIterator();
            final long start = System.nanoTime();
            listIterator.next();
            listIterator.remove();
            final long end = System.nanoTime();
            return end - start;
        } catch (ClassCastException e) {
            return 0;
        }
    }
}
