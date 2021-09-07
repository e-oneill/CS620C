package Week_2;
import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        //region Init
        Scanner sc = new Scanner(System.in);
        final int arraySize;
        int sum = 0;
        int avg = 0;
        //endregion;

        //region Input handling
        System.out.println("Enter the size of the array you want to enter");
        arraySize = sc.nextInt();

        int[] arr = new int[arraySize];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Please enter the item for index [" + i + "] for array");
            arr[i] = sc.nextInt();
        }
        sc.close();
        //endregion;

        //region Operation
        System.out.println("Array successfully populated");

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        } 

        avg = sum / arr.length;

        System.out.println("Sum of Array: " + sum);
        System.out.println("Average: " + avg);
        //endregion;
    }
}
