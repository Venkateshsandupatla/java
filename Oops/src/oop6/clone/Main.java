package oop6.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        clone rahul = new clone(21, "rahuk");
        // clone twin = new clone(rahul); // here by older method we are cloning the
        // object that is using a constructor
        // whoch takes parameter of object
        // System.out.println(twin.age + " " + twin.name);
        clone twin = (clone) rahul.clone();
        System.out.println(twin.age + " " + twin.name);

    }
}
