import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        /*
         * print 1 to 5 numbers using while loop
         */
        int num = 1; // intialization
        while (num <= 5) { // condition
            System.out.println(num);
            num++;

        }

        try (/*
              * print 1 to n where n is given by user
              */
                Scanner input = new Scanner(System.in)) {
            System.out.print("enter the number: ");
            int nu = input.nextInt();
            int i = 1;
            while (i <= nu) {
                System.out.println(i);
                i++;
            }
        }
        /*
         * Do while loop
         * in this the loop execute atleast one time
         * here first the loop execute then checks the while condition
         * do {
         * these things
         * } while (condition)
         */
        int a = 2;
        do {
            System.out.println("hi abbu");
        } while (a > 2); // here we gave condition a > 2 but our a is 1
                         // in case it is while loop the condition is checked first then loop is executed
                         // so that loop wont execute but here frst loop execute then condition is
                         // chekced so loop dosent execute in second iteratio
        int n = 5;
        do {
            System.out.println(n);
            n--;
        } while (n > 0);
    }

}
