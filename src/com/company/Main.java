package com.company;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.add(4);
        tree.add(6);
        tree.add(13);
        tree.add(5);
        tree.add(6);
        tree.add(1);
        tree.add(15);
        tree.add(23);
        tree.add(7);
        System.out.println(tree.binaryFind(1));
        tree.passLeftRightRoot();
        tree.passLeftRootRight();
        tree.passRootLeftRight();



    }
}
