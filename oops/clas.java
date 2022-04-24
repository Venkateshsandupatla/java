package oops;

import basicprograms.greeting;
import functions.string;

public class clas {
    public static void main(String[] args) {
        // lets creaate alist storing studdent list from the student class
        student[] students = new student[6];
        // we didnt assign any thing to our objects in list so it will show null
        // System.out.println(Arrays.toString(students));
        // lets create a object named venky
        student venky = new student(0, null, 0); // this will create an object
        System.out.println(venky); // we didnt assign any value to our object variables so it shows some random
                                   // thing

        // lets check what be the bydefault values of roll,names,marks . still now we
        // didnt assign value to our objects
        System.out.println(venky.roll); // -> 0
        System.out.println(venky.name); // -> null
        System.out.println(venky.marks); // -> 0.0

        // now lets assign the values to our instance variables
        venky.roll = 49;
        venky.name = "Venkatesh";
        venky.marks = 7.5f;

        // now lets see
        System.out.println(venky.roll);
        System.out.println(venky.name);
        System.out.println(venky.marks);

        // lets create objects and pass the values
        student abhi = new student(22, "abhilash", 97f);

        // now lets see the greeting of abhi
        abhi.greeting();

        // now lets change the name and greet
        abhi.changename("mr.abhi");
        abhi.greeting();

        // now at a time lets create one more object and acces both abhi and this object

        student rahul = new student(33, "rahullll", 66f);
        rahul.greeting(); // now we can see the power of this keyword , at once its see the abhi and then
                          // rahul
    }
}

// lets create a class named as student
class student {
    int roll;
    String name;
    float marks;

    // lets creaate some functions inside of our class

    // greeting function
    void greeting() {
        System.out.println("Hello this is " + this.name + "!");
    }

    // now we can change the name by this function

    void changename(String newname) { // to use this function one has to pass the new name
        this.name = newname;
    }

    // lets create a constructor
    student(int roll, String name, float marks) {
        this.roll = roll; // this keyword is like self in python
        this.name = name;
        this.marks = marks;
    }

}
