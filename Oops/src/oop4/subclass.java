package oop4;

public class subclass extends A {

    public subclass(int num, String name, int[] arr, int number, int aa) {
        super(num, name, arr, number, aa);

    }

    public static void main(String[] args) {
        subclass obj = new subclass(1, "ad", new int[2], 2, 213);
        System.out.println(obj.aa); // we can access the protected vairble from subclass
    }

}
