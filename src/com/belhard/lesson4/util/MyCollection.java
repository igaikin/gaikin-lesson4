package com.belhard.lesson4.util;

public interface MyCollection {

    int size();

    boolean add(Object obj);

    boolean remove(Object obj);

    boolean contains(Object obj);

    Object get();

    Object[] toArray();

}
