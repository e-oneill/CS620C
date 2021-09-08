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
        int[] arr2 = new int[arraySize];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Please enter the item for index [" + i + "] for array");
            arr[i] = sc.nextInt();
        }

        sc.close();
        //endregion;

        //region Operation
        System.out.println("Array successfully populated");

        for (int i : arr)
        {
            sum += i;
        } 

        avg = sum / arr.length;

        System.out.println("Sum of Array: " + sum);
        System.out.println("Average: " + avg);
        //endregion;

        //region Arrays Manipulations

        //Copying an array using arraycopy method
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        // System.out.print("[");
        // for (int i : arr2)
        // {
        //     System.out.print(i + ",");
        // }

        // Getting the smallest value in an array, including its index
        // System.out.println("]");
        int min = arr[0];
        int minPos = 0;
        // int valueHolder = min;
        // int posHolder = minPos;

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
            {

                min = arr[i];
                minPos = i;

            }
        }

        System.out.println("Minimum value is at index: " + minPos + "\nIts value is " + min);

        //Sorting an array
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //endregion;
    }
}
