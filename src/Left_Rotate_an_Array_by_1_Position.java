import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotate_an_Array_by_1_Position {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array :");
        int n = input.nextInt();
        if(n<=0){
            System.out.println("Kindly enter valid size of an array greater then 0 ");
            return;
        }

        int[]array = new int[n];
        ArrayInput(array,input);
        ArrayOutput(array);
        LeftRotateArray(array);
        ArrayOutput(array);


    }

    static void ArrayInput(int[]array,Scanner input){

        System.out.println("Kindly enter element in array ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a element in array at index "+i+" : ");
            array[i] = input.nextInt();
        }
    }

    static void ArrayOutput(int[]array){
        System.out.println(Arrays.toString(array));
    }

    static void LeftRotateArray(int[]array){
        int temp = array[0];

        for (int i=0; i<array.length-1;i++){
            array[i] =array[i+1];


        }
        array[array.length-1]=temp;
    }


}
