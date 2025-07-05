import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = input.nextInt();
        int[] array = new int[n];
        ArrayInput(array,input);
        ArrayOutput (array);
        Arrays.sort(array); // Add this line before RemoveDuplicates
        int newLength = RemoveDuplicates(array);
        System.out.print("\nSorted array after removing duplicates: ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }


        input.close();
    }
    static void ArrayInput( int[]array, Scanner input){

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = input.nextInt();
        }

    }
    static void ArrayOutput(int[]array){
        System.out.println("Element of an Array : ");
        System.out.println(Arrays.toString(array));
    }
    static int RemoveDuplicates(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array.length;
        }

        int j = 0; // index of the last unique element
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
        }
        return j + 1; // new length of array without duplicates
    }
}
