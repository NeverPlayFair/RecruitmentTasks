public class stringOfLength {

    // Method to generate string
    public static String genString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Length must be non-negative!!!");
        }

        // Initialize an empty result
        StringBuilder result = new StringBuilder();

        // Generate pattern based on index
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result.append('+');
            } else {
                result.append('-');
            }
        }

        return result.toString();
    }

    // Single main method to test the function
    public static void main(String[] args) {
        // Testing the function with some examples
        System.out.println(genString(5));  // Output: "+-+-+"
        System.out.println(genString(8));  // Output: "+-+-+-+-"

        // Negative value to trigger IllegalArgumentException(testing is my IllegalArgumentException working fine :))
        try {
            System.out.println(genString(-3));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
