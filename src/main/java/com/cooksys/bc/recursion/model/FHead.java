package com.cooksys.bc.recursion.model;

public class FHead<T> implements FList<T> {
    private T value;
    private FList<T> tail;

    public FHead(T value, FList<T> tail) {
        this.value = value;
        this.tail = tail;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public FList<T> getTail() {
        return tail;
    }

    public void setTail(FList<T> tail) {
        this.tail = tail;
    }
}
