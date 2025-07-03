
import java.util.Scanner;

public class Find_the_Maximum_Element_in_an_Array {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of element : ");
        int n = input.nextInt();

        if(n <= 0){
            System.out.println("Array must be greater then 0");
            input.close();
            return;
        }

        int [] array = new int[n];

        for (int i = 0; i <array.length; i++) {
            System.out.print("Enter your element of "+i+":");
            array[i] = input.nextInt();
        }
        int max = array[0];
        for (int i = 0; i <array.length; i++) {
            if(array[i]> max){
                max = array[i];
            }
        }
        System.out.println("Maximum element number in Array is : "+ max);
        input.close();
    }
}
