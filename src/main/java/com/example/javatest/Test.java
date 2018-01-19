package com.example.javatest;

/**
 */
public class Test {

    public static void main(String[] args) {

        NodeManager nm = new NodeManager();
        nm.add(1);
        nm.add(2);
        nm.add(3);
        nm.add(4);
        nm.add(5);
//        System.out.println(nm.find(4));
//        nm.print();
        nm.delete(3);
        nm.print();
//        nm.update(3,30);
//        nm.print();

    }

}
