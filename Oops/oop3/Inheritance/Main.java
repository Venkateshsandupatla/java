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

        // lets create the boxweight object
        Boxweight webox = new Boxweight();
        System.out.println(webox.l);
        // lets create an boxweight object which uses l,w,h from parent class
        Boxweight bo6 = new Boxweight(2, 3, 4, 5);
        System.out.println(bo6.l + " " + bo6.w + " " + bo6.h + " " + bo6.weight);

        // we can create an object by using refernce type as parent class and object as
        // child class
        Box box7 = new Boxweight(2, 3, 4, 5);
        // lets access the varaibles
        System.out.println(box7.l);
        // System.out.println(box7.weight); // but we cannot access the varible of child
        // class
        // what varibles are accesible can be decided by refernce type not object
        // here Box is refernce type and Boxweigh is object type
        // parent class cannot kknow what classes are there below it but chiild class
        // can know what classses are there above it so we cannot acces the child class
        // variables

        // lets create another type of instance/object
        // Boxweight box8 = new Box();
        // this is not possible
        // because refernce type is child , so child class should call the constructor
        // of parent class which is not possible so it shows eroor
        System.out.println("inhertiance staring ");

        Boxprice pr = new Boxprice();
        System.out.println(pr.l);

        // lets create another object with giving all the parameters
        Boxprice bb = new Boxprice(2, 3, 4, 5, 200);
        System.out.println(bb.cost);

        Boxweight aa = new Boxweight(1, 2, 4, 12);

        // lets create anothe robject by using old object
        Boxprice ol = new Boxprice(bb, 2331, 12);
        System.out.println(bb.cost);
    }
}
