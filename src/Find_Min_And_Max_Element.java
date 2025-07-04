import java.util.Scanner;

public class Find_Min_And_Max_Element {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int n = input.nextInt();
        if (n <= 0){
            System.out.println("Please enter a valid size of array Greater than 0");
            input.close();
            return;
        }
        int [] array = new int[n];

        for (int i = 0; i <array.length ; i++) {
            System.out.print("Enter your array element at "+ i+" position : ");
            array[i] = input.nextInt();
        }

        //For finding Min Element in Array
        int min = array[0];

        for (int num: array){
            if (num < min){
                min = num;
            }
        }
        System.out.println("Min element of an array is : " + min);


        // For finding max Element in Array

        int max = array[0];
        for (int num : array){
          if(max < num){
              max = num;
          }
        }
        System.out.println("max element of an array is : "+ max);

        input.close();
    }
}
