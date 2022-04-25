package oop1;

public class wrapperclass {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 1; // primitive into object --> now b is an object
        // final key word -> if we use final keyword for any primitive data types we can
        // not modify them
        final int bonus = 23; // we have to always intialize the final while declaring only
        // bonus = 1233; // it shows error we camnot modify
        // if we use the final keywod with other than primitive we can change the value
        // but we cannot re assing them
        final A venky = new A("venkatesh");
        // now we can change tjhe name
        venky.name = "Sandupatla venkatesh";
        System.out.println(venky.name);
        // but we can not re assing them
        // venky = new A("abhilash");// it shows error

        // lets sswap two numbers
        int num1 = 4;
        int num2 = 6;
        swap(num1, num2);
        System.out.println(num1 + "    " + num2); // we think that num1 and num2 are swapped but we get 4 and 6 only
                                                  // they are no swapped because in java we dont have pass by refernce
                                                  // we only have pass by value the values are swapped in the s3ap
                                                  // function but here the refernces are not known for us in java
        // we wrap this primitive data type to object -> INTGER , so we can swap by
        // knowing the refernce and values
        Integer q = 6;
        Integer w = 9;
        swap(q, w);
        System.out.println(q + "   " + w);

    }

    // function for swapping two numbers
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = a;

    }

    // this is also swap function but it dosent uses the primitive data types it
    // uses wrppaed integer
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = a;

    }
}

class A {
    // create a constructor
    String name;

    A(String name) {
        this.name = name;

    }
}
