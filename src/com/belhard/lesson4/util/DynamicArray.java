package com.belhard.lesson4.util;

public class DynamicArray implements MyCollection {//FIXME rewrite

    private int count = 0;
    private Object[] first;
    private Object[] second;

    public DynamicArray() {
        this.first = new Object[10];
    }

    public int size() {
        return count;
    }

    @Override
    public boolean add(Object obj) {
        if (count < first.length) {
            for (int i = 0; i < first.length; i++) {
                if (first[i] == null) {
                    first[i] = obj;
                    this.count++;
                    return true;
                }
            }
        } else if (count == first.length) {
            this.second = new Object[first.length * 2];
            for (int i = 0; i < first.length; i++) {
                second[i] = first[i];
            }
            this.first = new Object[first.length * 2];
            for (int i = 0; i < first.length; i++) {
                first[i] = second[i];
            }
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i] == null) {
                first[i] = obj;
                count++;
                return true;
            }
        }
        return false;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] != null && first[i] == obj) {
                first[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean contains(Object obj) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] != null && first[i] == obj) {
                System.out.println("Found::\n" + first[i]);
                return true;
            } else {
                System.out.println("Object not found!");
            }
        }
        return false;
    }

    public Object get() {
        Object obj = new Object();
        for (int i = 0; i < first.length; ) {
            if (first[0] != null) {
                obj = first[0];

            }

            first[0] = null;
        }
        return obj;
    }

    public Object[] toArray() {
        return first;
    }

}
