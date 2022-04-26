package oop2;

public class Human {
    String name;
    int age;
    int salary;
    Boolean married;
    static long population; // this variable is same for all the objects created from this class

    public Human(String name, int age, int salary, Boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    // lets create a static method/function
    static void fun1() {
        System.out.println("Hello im very funny");
        // in static methods we cannot use the "this" keyword
        // because as we know that it is static so we cannot create objects
        // so we cant use the this keyword
        // this.name;
    }
}
