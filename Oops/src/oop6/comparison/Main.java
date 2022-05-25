package oop6.comparison;

public class Main {
    public static void main(String[] args) {
        student rahul = new student(12, (float) 77.89);
        student abhi = new student(23, 98.7f);

        if (abhi.compareTo(rahul) > 0) {
            System.out.println(abhi.compareTo(rahul));
            System.out.println("abhi is highest");
        }
    }
}
