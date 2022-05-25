package Oop5.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();

        son.career();
        son.partner();
        daughter.career();
        daughter.partner();
        // as we know that we cant create object of abstract class so we have to direct
        // use it , like below
        Parent.greetig();

    }
}
