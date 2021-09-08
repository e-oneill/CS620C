package Week_2.Labs.Day_3;
import java.util.*;
public class LargestRow {
    public static void main(String[] args) {
    //region Set up variables and init scanner
    Scanner sc = new Scanner(System.in);
    int rows = 0;
    int columns = 0;
    int rowSum = 0;
    int largeRow = 0;
    String largestRow = "";

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

    //region Loop through the array and check which row contains the largest value
    for (int i = 0; i < rows; i++)
    {
        rowSum = 0;
        for (int j = 0; j < columns; j++)
        {
            rowSum += arr[i][j];
        }
        if (rowSum > largeRow)
        {
            largeRow = rowSum;
            largestRow = "Largest row = R" + (i+1);
        }
        else if (rowSum == largeRow)
        {
            largestRow = largestRow + " and R" + (i+1); 
        }
    }
    //endregion;

    //region Output result to screen
    System.out.println(largestRow);
    //endregion;
    }
}
