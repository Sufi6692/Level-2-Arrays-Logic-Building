import java.util.Scanner;
import java.util.Arrays;

public class Find_Missing_Number_From_1_to_N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of N (total numbers from 1 to N): ");
        int N = input.nextInt();

        if (N <= 1) {
            System.out.println("N must be greater than 1 to have a missing number.");
            input.close();
            return;
        }

        int[] array = new int[N - 1]; // one number is missing

        System.out.println("Enter " + (N - 1) + " numbers from 1 to " + N + " (one missing):");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.println("Input Array: " + Arrays.toString(array));

        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;

        for (int num : array) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number is: " + missingNumber);

        input.close();
    }
}
