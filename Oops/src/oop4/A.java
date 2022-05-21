package oop4;

public class A {
    int num;
    String name;
    int[] arr;
    // lets create a private variable
    private int number;

    // lets create getter and setter method for accessing and modifying the provate
    // varaible
    /// getter method
    public int getNumber() {
        return number;
    }

    // setter method
    public void setNumber(int n) {
        this.number = n;
    }

    // lets create a constructor
    public A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;

    }

    public A(int num, String name, int[] arr, int number) {
        this.num = num;
        this.name = name;
        this.arr = arr;
        this.number = number;
    }
}
