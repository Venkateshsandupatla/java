public class Boxweight extends Box { // extends keyword is used to inhert that class
    // this is child class of Box class
    // this class only has weight variable and l,w,h are used from the parent class
    // ie., box class
    double weight;

    // constructor
    Boxweight() {
        super();
        this.weight = -1;
    }

    // lets create a constructor
    Boxweight(double l, double h, double w, double weight) {
        super(l, h, w);
        // super keyword will call the parent class constructor
        // // It is used to intialise variables present in parent class
        this.weight = weight;
    }

    Boxweight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

}
