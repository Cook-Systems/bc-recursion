package com.cooksys.bc.recursion;

import com.cooksys.bc.recursion.library.FListLib;
import com.cooksys.bc.recursion.model.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FTree<Integer> tree = new FBranch<>();
        System.out.println(tree);
        tree.insert(10);
        System.out.println(tree);
        tree.insert(5);
        System.out.println(tree);
        tree.insert(30);
        System.out.println(tree);
        tree.insert(20);
        System.out.println(tree);
        tree.insert(40);
        System.out.println(tree);
        List<Integer> list = tree.toList();
        System.out.println(list);
    }

}
