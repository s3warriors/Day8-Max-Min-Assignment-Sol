public class TestMaximum1 {
    // Generic method to find maximum of three values
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
        System.out.println("Max of (10, 5, 8): " + findMax(10, 5, 8)); // Integer
        System.out.println("Max of (3.5, 1.2, 4.8): " + findMax(3.5f, 1.2f, 4.8f)); // Float
        System.out.println("Max of (Apple, Peach, Banana): " + findMax("Apple", "Peach", "Banana")); // String
    }
}
