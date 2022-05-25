package oop6.clone;

public class clone implements Cloneable { // for cloning we have to implement cloneable
    int age;
    String name;

    public clone(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public clone(clone other) {
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
