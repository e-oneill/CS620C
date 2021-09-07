package Week_2.Labs.Day_2;
import java.util.*;
public class SmallestLargest {
    public static void main(String[] args) {
        //region Init
        Scanner sc = new Scanner(System.in);
        final int arraySize;

        //endregion;

        //region Input handling
        // System.out.println("Enter the size of the array you want to enter");
        arraySize = sc.nextInt();
        int[] arr = new int[arraySize];


        for (int i = 0; i < arr.length; i++)
        {
            // System.out.println("Please enter the item for index [" + i + "] for array");
            arr[i] = sc.nextInt();
        }

        sc.close();
        //endregion;


        // Operations on array
        //region Getting smallest value in array
        int min = arr[0];
        int minPos = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
                minPos = i;
            }
        }
        //endregion;

        //region Getting largest value in array
        int max = arr[0];
        int maxPos = 0;


        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                maxPos = i;
            }
        }
        //endregion;

        //region Carrying out swap
        int temp = 0;
        int temp2 = 0;
        temp = arr[0];
        temp2 = arr[arr.length-1];
        arr[0] = min;
        arr[minPos] = temp;

        temp = arr[arr.length-1];
        arr[arr.length-1] = max;
        if (maxPos == 0)
        {
            maxPos = minPos;
        }
        arr[maxPos] = temp2;

        for (int i : arr)
        {
            System.out.print(i + " ");
        }

        //endregion;



    }
}
