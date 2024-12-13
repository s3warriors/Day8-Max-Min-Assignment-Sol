
import java.util.Arrays;

public class TestMaximum<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T findMax(T... elements) {
        T max = Arrays.stream(elements).max(T::compareTo).orElse(null);
        printMax(max);
        return max;
    }

    public static <T> void printMax(T max) {
        System.out.println("The maximum value is: " + max);
    }

    public static void main(String[] args) {
        findMax(10, 5, 8, 15);
        findMax(3.5f, 1.2f, 4.8f, 2.1f);
        findMax("Apple", "Peach", "Banana", "Grape");
    }
}





