package oop2;

public class Main {
    public static void main(String[] args) {
        // Human class is in same folder but differnet file so we no need to write
        // import , if it is in different folder we have to import them
        Human venky = new Human("venkatesh", 21, 50000, false);
        Human abhi = new Human("Abhilash", 28, 80000, true);
        System.out.println(venky.population);
        System.out.println(abhi.population);
    }
}
