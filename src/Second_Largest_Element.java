import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid size greater than 0.");
            input.close();
            return;
        }

        int[] array = new int[n];
        inputArray(array, input);
        printArray(array);
        findSecondLargest(array);

        input.close();
    }

    static void inputArray(int[] array, Scanner input) {
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element at index " + i + ": ");
            array[i] = input.nextInt();
        }
    }

    static void printArray(int[] array) {
        System.out.println("Your array: " + Arrays.toString(array));
    }

    static void findSecondLargest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be the same).");
        } else {
            System.out.println("Second largest element is: " + max2);
        }
    }
}
