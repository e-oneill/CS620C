package Week_2.Labs.Day_2;
import java.util.*;
public class Clumps {
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

        //region Check for Biggest Clump
        int maxClump = 0;
        int currClump = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (i == 0)
            {
                maxClump = 1;
                currClump = 1;
            }
            else if (arr[i] == arr[i-1])
            {
                currClump++;

                if (currClump > maxClump)
                {
                    maxClump = currClump;
                }
            }
            else
            {
                currClump = 1;
            }
        }

        System.out.println("Biggest Clump Size: " + maxClump);
        //endregion;
    }
}
