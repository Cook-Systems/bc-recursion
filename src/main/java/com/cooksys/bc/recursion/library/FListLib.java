package com.cooksys.bc.recursion.library;

import com.cooksys.bc.recursion.model.FList;

public class FListLib {


    public static int length(FList<?> list) {
        if(list == null) {
            return 0;
        } else {
            return 1 + FListLib.length(list.getTail());
        }
    }

    public static <T> T getAtIndex(int index, FList<T> list) {
        if(list == null) {
            return null;
        } else if(index == 0) {
            return list.getValue();
        } else {
            return FListLib.getAtIndex(index - 1, list.getTail());
        }
    }


}