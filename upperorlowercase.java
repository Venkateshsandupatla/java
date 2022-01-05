import java.util.Scanner;

public class upperorlowercase {
    public static void main(String[] args) {
        // Find whether the user is given lowercasse alphabet or upper case alphabet
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is Lowercas alphabet");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Its is Upper case alpahbet");
        }
    }

}
