package Oop5.Interface;

public interface engine {
    // every variavle in interface must be final and static
    final static int PRICE = 789000;

    // interface also same like abstract class , we just intialise the methods but
    // we cant write body
    void start();

    void stop();

    void acc();
}
