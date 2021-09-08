package Week_2.Labs.Day_3;
import java.util.*;
public class SumOfOdd {
    public static void main(String[] args) {
        //region Set up variables and init scanner
        Scanner sc = new Scanner(System.in);
        int rows = 0;
        int columns = 0;
        int oddCount = 0;
        int oddSum = 0;
        //endregion;

        //region Handle User Input and generate array
        System.out.println("Please enter the number of rows in the array");
        rows = sc.nextInt();

        System.out.println("Please enter the number of columns in the array");
        columns = sc.nextInt();
        int[][] arr = new int [rows][columns];
        for (int i = 0; i < rows; i++)
        {
            System.out.println("Please enter the data for row " + i);
            for (int j = 0; j < columns ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        
        //endregion;

        //region Print Outputs to Screen
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (arr[i][j] % 2 != 0)
                {
                    oddCount++;
                    oddSum += arr[i][j];
                }
            }
        }
        // Print Odd number count = x
        System.out.println("Odd number count = " + oddCount);

        // Print Sum of odd numbers = y
        System.out.println("Sum of odd numbers = " + oddSum);
        //endregion;
    }
}
