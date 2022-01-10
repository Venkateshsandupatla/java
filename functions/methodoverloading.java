package functions;

public class methodoverloading {
    public static void main(String[] args) {
        fun("sda");
        fun(3);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String a) {
        System.out.println(a);
    }
}
