package com.cooksys.bc.recursion.model;

import java.util.ArrayList;
import java.util.List;

public class FBranch<T extends Comparable<T>> implements FTree<T> {

    private T value;
    private FTree<T> left;
    private FTree<T> right;

    public FBranch() {
    }

    @Override
    public void insert(T t) {
        if (value == null) {
            value = t;
        } else if (value.compareTo(t) < 0) {
            if (right == null) {
                right = new FBranch<T>();
            }
            right.insert(t);
        } else if (value.compareTo(t) > 0) {
            if (left == null) {
                left = new FBranch<T>();
            }
            left.insert(t);
        }
    }

    @Override
    public List<T> toList() {
        List<T> result = new ArrayList<>();
        if (value != null) {
            result.add(value);
            if(left != null) {
                List<T> leftList = left.toList();
                leftList.addAll(result);
                result = leftList;
            }
            if(right != null) {
                result.addAll(right.toList());
            }
        }
        return result;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public int getSize() {
        return
                1 + (
                        left == null ? 0 : left.getSize()
                ) + (
                        right == null ? 0 : right.getSize()
                );
    }

    @Override
    public String toString() {
        return "FBranch{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
