public class Box {
    double l;
    double h;
    double w;

    // lets create constructor
    // constructor-1,this constructor is called when no parameters like l ,h,w are
    Box() {
        // when this constructor is called all the values become -1
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // lets create another constructor
    // this constructor is called when only one dimension is provided
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    // lets create another construcor
    // this constructor is called when we give 3 dimensions
    Box(double side1, double side2, double side3) {
        this.l = side1;
        this.h = side2;
        this.w = side3;

    }

    // lets creatte one more constructo
    // this constructor is called when a box object is given ie., a copy constructor
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    // lets create a method
    public void information() {
        System.out.println("The box is running");
    }
}
