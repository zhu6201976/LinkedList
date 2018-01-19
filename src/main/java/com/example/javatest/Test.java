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
        System.out.println("----------print---------");
        nm.print();
        System.out.println("----------find---------");
        System.out.println(nm.find(1));
        System.out.println("----------delete--------");
        nm.delete(3);
        nm.print();
        System.out.println("----------update--------");
        nm.update(5, 50);
        nm.print();
        System.out.println("----------insert--------");
        nm.insert(0,0);
        nm.print();

    }

}
