package oop2;

public class StaticBlocks {

    static int a = 7; // here its a static variable
    static int b; // here the static variable is not intialized

    // we can intialize the static variables by static block
    // it is a static block
    // static block is runned only once , when the first obj is created ie., wheen
    // the class is loaded for the first time
    static {
        System.out.println("Im static block");
        b = a * 5; // we can intialize from here

    }

    public static void main(String[] args) {
        // lets create an object for static block and use it
        StaticBlocks obj = new StaticBlocks();
        System.out.println(StaticBlocks.a + "   " + StaticBlocks.b);
        // now change the value
        StaticBlocks.b += 3;
        // lets creata another obj and access the varibles
        StaticBlocks obj1 = new StaticBlocks(); // we created one more obj but static block is not runned as we see in
                                                // the terminal it didint dipslay static block is running
        // now the b value changes to 7*5 +3
        System.out.println(StaticBlocks.a + "  " + StaticBlocks.b);
    }
}
