package functions;

import java.util.Arrays;

// variable args means if we have a function and we dont know how many variblels we are passing in that function at that time we use varargs so that we can pass as many varaibles we wish. 
public class varargs {
    public static void main(String[] args) {
        fun(2, 3, 4, 23, 1, 33, 42, 3, 42); // we can give as many as we can
        multiple(2, 5, "ramu", "venky", "gh");
    }

    static void multiple(int a, int b, String... v) { // this means it takes frst two as intger then it takes strings as
                                                      // many as we give and the var args should be at the end of
                                                      // arguments
        System.out.println(Arrays.toString(v));

    }

    static void fun(int... v) { // these 3 dots is for varargs that means we can pass as many integer varaible
                                // we can

        System.out.println(Arrays.toString(v)); // here those integers are converted into array and prints on console

    }

}
