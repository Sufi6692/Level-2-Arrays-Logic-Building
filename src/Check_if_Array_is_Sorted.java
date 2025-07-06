
import java.util.Arrays;
import java.util.Scanner;

public class Check_if_Array_is_Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int n = input.nextInt();
        if(n<=0){
            System.out.println("Enter a valid size greater then 0 ");
            input.close();
            return;
        }
        int[] array = new int[n];
        ArrayInput(array,input);
        ArrayOutput(array);
        CheckArraySorted(array);

        input.close();
    }

    static void ArrayInput(int[]array,Scanner input){
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element at index " + i+" : ");
            array[i] = input.nextInt();
        }
    }

    static  void ArrayOutput(int[]array){
        System.out.println(Arrays.toString(array));
    }

    static void CheckArraySorted(int[]array){
        System.out.println("Checking Array is sorted or not :");
        boolean sorted = true;
        for (int i=0; i < array.length-1;i++){
            if(array[i] > array[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted ==true) {
            System.out.println("Array is sorted ");
        }else {
            System.out.println("Array is not sorted");
            System.out.println("The sorted version of the array would be:");
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }
    }

}
