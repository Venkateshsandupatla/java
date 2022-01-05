public class condition {
    public static void main(String[] args) {
        int sal = 2300;
        /*
         * if condition
         */
        if (sal > 2300) {
            sal = sal + 1000;
        } else if (sal < 2300) {
            sal = sal + 2000;
        } else {
            sal = sal + 500;
        }
        System.out.println("salary is " + sal);

    }
}
