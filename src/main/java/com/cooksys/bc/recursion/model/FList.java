package com.cooksys.bc.recursion.model;

public interface FList<T> {
    public T getValue();
    public FList<T> getTail();
}
