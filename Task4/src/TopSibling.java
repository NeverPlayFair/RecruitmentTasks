import java.util.Arrays;

public class TopSibling {
    public static void main(String[] args) {
        int n = 213; // Start value
        int TopSibling = getTopSibling(n);
        System.out.println("Largest numer in the family of " + n + " is: " + TopSibling);
    }

    public static int getTopSibling(int n) {
        // Conversion of the number n to an array of characters 
        char[] characters = String.valueOf(n).toCharArray();

        // Sorting characters in descending order
        Arrays.sort(characters);

        // Reverse the order of the characters to be in descending order
        StringBuilder sb = new StringBuilder(new String(characters));
        sb.reverse();

        // Converting the result back to an integer
        int TopSibling = Integer.parseInt(sb.toString());

        return TopSibling;
    }
}
