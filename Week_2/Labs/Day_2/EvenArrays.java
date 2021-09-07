package Week_2.Labs.Day_2;
import java.util.*;
public class EvenArrays {
    public static void main(String[] args) {
        //region Init 
        Scanner sc = new Scanner(System.in);
        final int arraySize;
        arraySize = 10;
        //endregion;

        //region User Input
        int[] arr = new int[arraySize];
        int base = 0;

        System.out.println("Enter base number for array");
        base = sc.nextInt();
        int evenCount = 0;
        int i = base+1;
        
        while (evenCount < 10)
        {
            if (i % 2 == 0)
            {
                arr[evenCount] = i;
                evenCount++;
            }
            i++;
        }

        // Prompt user repeatedly for new input
        boolean userCancel = false;
        int userIndex = 0;

        while (!userCancel)
        {
            userIndex = sc.nextInt();

            if (userIndex == -1)
            {
                break;
            }
            else if (userIndex >= arr.length)
            {
                System.out.println("Position " + userIndex + ": No such index!");
            }
            else
            {
                System.out.println("Position " + userIndex + ": " + arr[userIndex]);
            }

        }


        //endregion;


        sc.close();

    }
}
