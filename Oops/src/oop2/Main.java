package oop2;

public class Main {
    public static void main(String[] args) {
        // Human class is in same folder but differnet file so we no need to write
        // import , if it is in different folder we have to import them
        Human venky = new Human("venkatesh", 21, 50000, false);
        Human abhi = new Human("Abhilash", 28, 80000, true);
        System.out.println(venky.population);
        System.out.println(abhi.population);
        // greeting(); // main is the static method , so we cannpt use non static inside
        // a static method
    }

    // lets create a static method
    static void fun() {
        System.out.println("Its fun");
        // greeting(); // here also it is static ethod so we canno use non static
        // methods inside the
        // static method

        // to use non static inside static we have to create object for non static and
        // then we can use it
        // By main we can create object by itself
        Main obj = new Main(); // here obj is our object or instance now we can use the greeting which is non
                               // static metjod
        obj.greeting();
    }

    // this is a non-static function
    void greeting() {
        System.out.println("Hi");
        // but in non static we can use the static methods directly
        fun(); // here we cannot see any error
    }
}
