public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        Box box1 = new Box();
        System.out.println(box1.l); // it prints -1
        Box box2 = new Box(2.3);
        System.out.println(box2.l + "   " + box2.h + "   " + box2.w);
        Box box3 = new Box(2, 2, 3);
        System.out.println(box3.h + "  " + box3.l + "  " + box3.w);
        Box copybox = new Box(box2);
        System.out.println(copybox.l + "     " + copybox.h + " " + copybox.w);

    }
}
