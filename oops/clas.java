package oops;

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

        // now lets call one constructor and internally call another constructor
        student newperson = new student();
        System.out.println(newperson.name); // it prints the default name we given in the constructor as this(,,,)

        // lets create two objects one will point to another
        student one = new student(); // as we know that we have given the constructor has a default name
        // lets create second object which is pointing to first object
        student two = one; // this means one and two students are pointing to same refernce in heap memory
        // lets change the value of name in one so that two also changes
        one.name = "something nothing";
        // now lets print the second name
        System.out.println(two.name); // it prints the chnaged name which we done by one
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

    // creating another constructor and calling the student constructor with this
    // constructor
    // call constructor from another constucter
    student() {
        // this is how you call a constuctor from another constructor
        this(13, "Default name", 89.5f);
    }

    // lets create a constructor
    student(int roll, String name, float marks) {
        this.roll = roll; // this keyword is like self in python
        this.name = name;
        this.marks = marks;
    }

}
