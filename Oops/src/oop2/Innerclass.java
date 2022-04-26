package oop2;

import oop1.a;

public class Innerclass {
    // class inside a class is known as inner class
    // lets create a class named as test
    /**
     * InnerInnerclass
     */
    static class Test {
        String name;

        // create a constructor
        public Test(String name) {
            this.name = name;

        }

    }

    public static void main(String[] args) {
        Test a = new Test("venky");
        Test b = new Test("abhi");
        System.out.println(a.name);
    }
}
