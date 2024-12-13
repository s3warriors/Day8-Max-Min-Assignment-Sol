import java.util.Arrays;

public class TestMaximum<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T findMax(T... elements) {
        return Arrays.stream(elements).max(T::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        System.out.println("Max of (10, 5, 8, 15): " + findMax(10, 5, 8, 15));
        System.out.println("Max of (3.5, 1.2, 4.8, 2.1): " + findMax(3.5f, 1.2f, 4.8f, 2.1f));
        System.out.println("Max of (Apple, Peach, Banana, Grape): " + findMax("Apple", "Peach", "Banana", "Grape"));
    }
}



