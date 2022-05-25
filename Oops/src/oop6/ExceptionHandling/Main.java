package oop6.ExceptionHandling;

public class Main {

    public static void main(String[] args) {

        int a = 7;
        int b = 0;

        // System.out.println(c);

        // lets use try and catch
        try {
            int c = a / b;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("No matter whether our code give exception or not finally will run");
        }
    }
}
