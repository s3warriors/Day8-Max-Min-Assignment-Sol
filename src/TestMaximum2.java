public class TestMaximum2<T extends Comparable<T>> {
    private T a, b, c;

    // Constructor
    public TestMaximum2(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method to find maximum
    public T testMaximum() {
        return TestMaximum2.findMax(a, b, c);
    }

    // Static method for finding maximum
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        TestMaximum2<Integer> maxInteger = new TestMaximum2<>(10, 5, 8);
        System.out.println("Max Integer: " + maxInteger.testMaximum());

        TestMaximum2<Float> maxFloat = new TestMaximum2<>(3.5f, 1.2f, 4.8f);
        System.out.println("Max Float: " + maxFloat.testMaximum());

        TestMaximum2<String> maxString = new TestMaximum2<>("Apple", "Peach", "Banana");
        System.out.println("Max String: " + maxString.testMaximum());
    }
}
