package functions;

public class returnstring {
    public static void main(String[] args) {
        String msg = greet();
        System.out.println(msg);
    }

    static String greet() {
        String greeting = "hi how are you?";
        return greeting;
    }
}
