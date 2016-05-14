package com.cooksys.bc.recursion.model;

import java.util.List;

public interface FTree<T extends Comparable<T>> {
    public void insert(T t);
    public List<T> toList();
    public T getValue();
    public int getSize();
}
