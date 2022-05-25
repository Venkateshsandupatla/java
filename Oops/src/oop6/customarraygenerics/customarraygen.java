package oop6.customarraygenerics;

public class customarraygen<T> {
    private Object[] arr;
    private int size = 0;
    private int DEFAULT_SIZE = 10;

    public customarraygen() {
        Object arr = new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        arr[size++] = value;
    }

    private void resize() {
        Object temp[] = new Object[arr.length * 2];

        // now copy the old array items
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return size == arr.length;
    }

    public T rempve() {
        T removed = (T) (arr[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) (arr[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        arr[index] = value;

    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        // list.
        // lets use our own custom array list
        customarraygen<String> list = new customarraygen<>();
        list.add("asda");
        customarraygen<Integer> list1 = new customarraygen<>();
        list1.add(2);
    }
}
