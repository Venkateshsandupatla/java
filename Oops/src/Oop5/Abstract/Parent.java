package Oop5.Abstract;

public abstract class Parent {
    abstract void career();

    abstract void partner();

    // We cannot create objects of abstract class
    // we cannot create abstract constructors
    // static methods are not overriden , abstratc methods are must be overriden so
    // we cannot create abstract static methods
    // static abstract void a();
    // But we can create static methods in abstrcat class
    static void greetig() {
        System.out.println("Hi welcome to abstract class");
    }

    void normal() {
        System.out.println("Hi this is a normal method insidde a aabstrct class");
    }
}
