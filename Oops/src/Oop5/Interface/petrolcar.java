package Oop5.Interface;

public class petrolcar implements engine, Brake, mediaplayer { // we can do multiple inheritance in interface but in
                                                               // class we cant

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("I brake like a petrol car");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("I start like a petrol car");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("I stop like a  petrol car");

    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("I accelerate like a petrol car");

    }

}
