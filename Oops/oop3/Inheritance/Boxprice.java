public class Boxprice extends Boxweight {
    double cost;

    Boxprice() {
        super();
        this.cost = -1;
    }

    Boxprice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight); // super will invoke the parent class one ie., boxweight
        this.cost = cost;

    }

    Boxprice(Boxweight old, double weight, double cost) {
        super(old, weight);
        this.cost = cost;

    }

}
