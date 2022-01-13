package linandbinarysearch;

public class searchinsring {
    public static void main(String[] args) {
        String name = "venky";
        char target = 'e';
        // System.out.println(name.length());
        int ans = search(name, target);
        System.out.println(ans);

        Boolean s = sear(name, target);
        System.out.println(s);
    }

    static int search(String name, char target) {
        if (name.length() == 0) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) { // char at gives the character of that string at that index
                return i;
            }

        }

        return -1;
    }

    // this function will print whether the character is present or not in the
    // string
    static boolean sear(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (char ch : name.toCharArray()) { // name.tochararray converts our string
            // int 'v' , 'e', 'n','k','y' so that
            if (ch == target) {
                return true; // if we want to search whether the char is there or not
            }
        }

        return false;

    }
}
