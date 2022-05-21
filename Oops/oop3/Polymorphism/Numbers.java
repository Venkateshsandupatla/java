public class Numbers {
    int Sum(int a, int b) {
        return a + b;
    }

    int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.Sum(2, 3);

    }
}
