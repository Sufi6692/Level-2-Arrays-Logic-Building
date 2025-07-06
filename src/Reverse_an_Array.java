import java.util.Arrays;
import java.util.Scanner;

public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = input.nextInt();
        if(n<=0){
            System.out.println("Please enter a valid size greater then 0");
        }
        int[] array = new int[n];
        ArrayInput(array,input);
        System.out.println("your array :");
        ArrayOutput(array);
        ReverseArray(array);
        System.out.println("Reverse array :");
        ArrayOutput(array);
    }

    static void ArrayInput(int[]array,Scanner input){
        System.out.println("Kindly enter your array element : ");
        for(int i = 0; i<array.length;i++){
            System.out.print("Enter you array element at index "+i+" : ");
            array[i]=input.nextInt();
        }
    }

    static void ArrayOutput(int[]array){
        System.out.println(Arrays.toString(array));
    }

    static void ReverseArray(int[]array){
        int i = 0,j= array.length-1;
        while (i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

}
