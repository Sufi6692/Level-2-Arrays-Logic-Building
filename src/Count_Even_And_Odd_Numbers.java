import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Count_Even_And_Odd_Numbers {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int n = input.nextInt();

        if( n<0){
            System.out.println("Enter a valid array size greater than 0.");
            input.close();
            return;
        }
        int[] array = new int[n];
        InputArray(array,input);
        PrintArray(array);
        CountEvenAndOddNumber(array);

        input.close();
    }

    static void InputArray(int[] array, Scanner input){

        System.out.println("Kindly enter elements in array  -> ");
        for (int i =0; i < array.length; i++){
            System.out.print("Enter element at index "+ i+" :");
            array[i] = input.nextInt();
        }

    }

    static void PrintArray(int[]array){
        System.out.println(Arrays.toString(array));
    }

    static void CountEvenAndOddNumber(int[]array){
        System.out.println("Counting Even and Odd numbers : ");
        int EvenCount = 0;
        int OddCount = 0;
        for (int i = 0; i<array.length;i++){
            if (array[i]%2==0){
                EvenCount++;
            } else if (array[i]%2!=0) {
                OddCount++;
            }
        }
        System.out.println("EvenCount is : "+EvenCount);
        System.out.println("OddCount is  : "+OddCount);
    }
}
