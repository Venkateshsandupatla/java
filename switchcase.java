import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        // switch cases
        // we will give a input of a fruit name , based on the fruit name its should
        // describe about it
        // like if we give mango as inout it should give king of fruit
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fruit name");
        String fruit = input.next();
        // switch case begins
        switch (fruit) {
            case "mango":
                System.out.println("King of the fruit");
                break;
            case "Apple":
                System.out.println("Good for health");
                break;
            case "Orange":
                System.out.println("Orange in colour");
                break;
            default:
                System.out.println("please provide a fruit name");
        }
    }
}