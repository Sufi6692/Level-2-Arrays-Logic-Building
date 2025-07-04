import java.util.Scanner;

public class Search_Element_In_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = input.nextInt();
        if (n <= 0){
            System.out.println("Enter Valid Array size greater then 0");
            input.close();
            return;
        }

        int[] array = new int[n];

        for (int i = 0; i< array.length;i++){
            System.out.print("Enter your element at "+i+" position : ");
            array[i] = input.nextInt();

        }

        System.out.print("Enter the number which you want to search : ");
        int UserNumber = input.nextInt();
        boolean found = false;
        for(int i = 0; i <array.length ; i++) {
            if (array[i] == UserNumber){
                found = true;
                System.out.println("The Number " + UserNumber + " is available in array at index " + i);
                break;
            }
        }
        if (!found){
            System.out.println(UserNumber+" This number is not available in array");
        }
        input.close();
    }
}
