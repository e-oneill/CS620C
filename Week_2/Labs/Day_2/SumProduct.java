package Week_2.Labs.Day_2;
import java.util.*;
public class SumProduct {
    public static void main(String[] args) {
        //region Initialize Scanner and fundamental vars
        Scanner sc = new Scanner(System.in);
        final int arraySize;
        //endregion;

        //region Handle User input and create array
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

        //region Sum and Product Calculation
        int sum = 0;
        int prod = 1;
        int max = arr[0];

        for (int i: arr)
        {
            sum += i;
            prod = prod*i;
            if (i > max)
            {
                max = i;
            }

        }
        //endregion;

        //region Print result to screen
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
        System.out.println("Largest Number: " + max);
        //endregion;
    }
}
