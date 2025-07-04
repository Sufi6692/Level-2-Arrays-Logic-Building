import java.util.Scanner;

public class Find_the_Minimum_Element_in_an_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int n = input.nextInt();

        if (n <= 0){
            System.out.println("Please enter a valid array size greater than 0.");
            input.close();
            return;
        }
        int[] array = new int[n];
        for (int i = 0; i <array.length ; i++) {
            System.out.print("Enter Array element at " + i+ " :");
            array[i]=input.nextInt();
        }
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Min number of Array is : " + min);
        input.close();

    }
}
