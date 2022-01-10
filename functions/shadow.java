package functions;

import javax.swing.plaf.synth.SynthDesktopIconUI;

/**
 * shadow
 */
public class shadow {
    static int x = 40; // it has scope of below this block

    public static void main(String[] args) {
        System.out.println(x); // we can get the x value here also
        // now even though a x is declared and intialized we can create one more
        int x = 90;
        // now if we print x it prints 90 that means previous x is hidded this is known
        // as shadowing
        System.out.println(x); // here it prints 90
        fun(); // it prints 40
    }

    static void fun() {
        System.out.println(x); // here it prints 40 because 90 has scope inside that function only
    }
}