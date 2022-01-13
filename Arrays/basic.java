package Arrays;

public class basic {
    public static void main(String[] args) {
        // syntax
        // datatype[] variblename = new datatype[size]; this is an array
        // if we have to store rollnumbers of 5 students
        int[] rollnumbers = new int[5]; //
        // other way to create the array
        int[] rollnumber1 = { 1, 4, 2, 5, 6, 9 };
        //
        int[] ros; // it is only declarations of array and it is declared in the stack memory
        ros = new int[6]; // now the array is intialized and the object is created in the heap memory
        System.out.println(ros[1]); // we didnt give any numbers in the ros but by default for an integer array all
                                    // the values are 0 -> [0,0,0,0,0]
        // System.out.println(rollnumber1[2]);

        // lets create a string array
        String[] name = new String[5];
        System.out.println(name[3]); // by default all the values inn string array are null
    }
}
