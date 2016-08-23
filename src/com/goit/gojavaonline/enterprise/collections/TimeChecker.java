package com.goit.gojavaonline.enterprise.collections;

import java.util.*;

public class TimeChecker {

    private Collection<Integer> collection;
    private int meter;
    private Random random = new Random(Integer.MAX_VALUE);

    public TimeChecker(Collection<Integer> collection, int meter) {
        this.collection = collection;
        this.meter = meter;
    }

    public Collection<Integer> getCollection() {
        return collection;
    }

    public long checkPopulate(final int numberOfThousands) {
        final long start = System.nanoTime();
        final int THOUSAND = 1000;
        for (int i = 0; i <= numberOfThousands * THOUSAND; i++) {
            collection.add(random.nextInt(THOUSAND * numberOfThousands));
        }
        final long end = System.nanoTime();
        return end - start;
    }

    public long checkGetting() {
        long time = 0;
        try {
            for (int i = 0; i <= meter; i++) {
                final long start = System.nanoTime();
                ((List<Integer>) collection).get(random.nextInt(collection.size()));
                final long end = System.nanoTime();
                time += end - start;
            }
            return time / meter;
        } catch (ClassCastException e) {
            return 0;
        }
    }

    public long checkAdding() {
        long time = 0;
        for (int i = 0; i <= meter; i++) {
            final long start = System.nanoTime();
            collection.add(random.nextInt());
            final long end = System.nanoTime();
            time += end - start;

        }
        return time / meter;
    }

    public long checkRemoving() {
        long time = 0;
        for (int i = 0; i <= meter; i++) {
            int removingElement = random.nextInt(collection.size() / 2);
            final long start = System.nanoTime();
            collection.remove(removingElement);
            final long end = System.nanoTime();
            time += end - start;
        }
        return time / meter;
    }

    public long checkContains() {
        long time = 0;
        for (int i = 0; i <= meter; i++) {
            final long start = System.nanoTime();
            collection.contains(random.nextInt(collection.size() / 2));
            final long end = System.nanoTime();
            time += end - start;
        }
        return time / meter;
    }

    public long checkIteratorAdd() {
        long time = 0;
        try {
            for (int i = 0; i <= meter; i++) {
                final long start = System.nanoTime();
                ((List<Integer>) collection).listIterator().add(random.nextInt(collection.size()));
                final long end = System.nanoTime();
                time += end - start;
            }
            return time/ meter;
        } catch (ClassCastException e) {
            return 0;
        }
    }

    public long checkIteratorRemove() {
        long time = 0;
        try {
            for (int i = 0; i<= meter; i++) {
                ListIterator listIterator = ((List<Integer>) collection).listIterator();
                final long start = System.nanoTime();
                listIterator.next();
                listIterator.remove();
                final long end = System.nanoTime();
                time += end - start;
            }
            return time/ meter;
        } catch (ClassCastException e) {
            return 0;
        }
    }
}
