package oop6.customarrraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class customarraylist {
    private int[] arr;
    private int size = 0;
    private int DEFAULT_SIZE = 10;

    public customarraylist() {
        int[] arr = new int[DEFAULT_SIZE];
    }

    public void add(int value) {
        if (isFull()) {
            resize();
        }
        arr[size++] = value;
    }

    private void resize() {
        int temp[] = new int[arr.length * 2];

        // now copy the old array items
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return size == arr.length;
    }

    public int rempve() {
        int removed = arr[--size];
        return removed;
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        arr[index] = value;

    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        // list.
        // lets use our own custom array list
        customarraylist list = new customarraylist();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(0);
        // System.out.println(Arrays.toString(list));

    }
}
