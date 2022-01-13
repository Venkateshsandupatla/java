package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10); // this 10 is intial capacity but we can add as many numbers in
                                                       // our list

        // lets input our array elements

        // list.add(10);
        // list.add(2);
        // System.out.println(list); // this will print the list here we no need of
        // array.tostring it internally does
        // it
        // if we want to do by for loop

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // output
        System.out.println(list);

        // output by for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
    }
}
