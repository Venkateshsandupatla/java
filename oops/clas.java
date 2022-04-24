package oops;

public class clas {
    public static void main(String[] args) {
        // lets creaate alist storing studdent list from the student class
        student[] students = new student[6];
        // we didnt assign any thing to our objects in list so it will show null
       // System.out.println(Arrays.toString(students));
       //lets create a object named venky
       student venky = new student(); // this will create an object 
       System.out.println(venky);  // we didnt assign any value to our object variables so it shows some random thing
    }
}

// lets create a class named as student
class student{
    int roll;
    String name;
    float marks;
}
