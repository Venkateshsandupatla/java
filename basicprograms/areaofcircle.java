package basicprograms;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the radius of circle: ");
        // int r = input.nextInt();
        // System.out.println(Math.PI * (Math.pow(r, 2)));
        // System.out.println(square());
        System.out.println(3 / 2);
        // System.out.println(17 / 10);
    }

    static int triangle(int breadth, int height) {
        return (1 / 2) * (breadth * height);
    }

    static int square() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        int a = input.nextInt();
        return a * a;
    }

}
