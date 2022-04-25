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
}
