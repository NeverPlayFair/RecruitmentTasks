import java.util.Arrays;

public class BalanceArray {
    public static void main(String[] args) {
        // Input nFirst = 4, nSecond = 3
        int nFirst = 4;
        int[] resultOne = generateBalanceArray(nFirst);
        System.out.println("Output for n = " + nFirst + ": " + Arrays.toString(resultOne));

        int nSecond = 3;
        int[] resultTwo = generateBalanceArray(nSecond);
        System.out.println("Output for n = " + nSecond + ": " + Arrays.toString(resultTwo));
    }

    public static int[] generateBalanceArray(int n) {
        int[] result = new int[n];

        // Even numbers case
        int oddIndex = 0;
        for (int i = 1; i <= n / 2; i++) {
            result[oddIndex++] = i;
            result[oddIndex++] = -i;
        }

        // Odd numbers case
        if (n % 2 != 0) {
            result[oddIndex] = 0;
        }

        return result;
    }
}
