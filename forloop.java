import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        // Q: print 1 to 5 numbers
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }
        // Q: print 1 to n numbers where n is given by the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
