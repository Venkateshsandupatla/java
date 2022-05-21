package oop4;

public class Main {
    public static void main(String[] args) {
        // lets create object of A class
        A obj = new A(21, "venky", new int[12]);
        System.out.println(obj.name);

        // another object
        A obj1 = new A(22, "abhi", new int[1], 31);
        System.out.println(obj1.name);
        // if we want to access number we cant beacause it is private varible , it can
        // be accesisble from that class only
        // System.out.println(obj1.number);

        // lets access the number by getter method
        System.out.println(obj1.getNumber());

        // lets set the number

        obj1.setNumber(12);

        // now get the number
        System.out.println(obj1.getNumber());

    }
}
