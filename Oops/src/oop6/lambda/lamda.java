package oop6.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lamda {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1);
        }

        // list.forEach((item) -> System.out.println(item * 2));
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);

    }

}
