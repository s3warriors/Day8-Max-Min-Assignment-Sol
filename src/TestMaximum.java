public class TestMaximum {
    // Method to find maximum of three strings
    public static String findMax(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max of (Apple, Peach, Banana): " + findMax("Apple", "Peach", "Banana")); // Test Case
    }
}


