import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        // for character input we have to use string and take the letter from string
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        // next will give string and trim will cut extra spaces before starting a word
        System.out.println(ch);

        String a = input.next();
        System.out.println(a);
        System.out.println(a.trim());
        System.out.println(a.trim().charAt(0));
    }

}
