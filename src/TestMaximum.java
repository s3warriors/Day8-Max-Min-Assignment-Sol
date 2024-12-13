public class TestMaximum {
    // Method to find maximum of three floats
    public static Float findMax(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max of (3.5, 1.2, 4.8): " + findMax(3.5f, 1.2f, 4.8f)); // Test Case
        System.out.println("Max of (1.2, 5.8, 4.8): " + findMax(1.2f, 5.8f, 4.8f)); // Test Case
        System.out.println("Max of (1.2, 3.5, 7.9): " + findMax(1.2f, 3.5f, 7.9f)); // Test Case
    }
}

