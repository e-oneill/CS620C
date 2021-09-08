package Week_2.Labs.Day_3;
import java.util.*;
public class SumofDiagonals {
    public static void main(String[] args) {
    //region Set up variables and init scanner
    Scanner sc = new Scanner(System.in);
    int rows = 0;
    int columns = 0;
    int diagonal1 = 0;
    int diagonal2 = 0;


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

    //region Sum the diagonals
    // Diagonal 1 - left to right
    // Diagonal 1 starts in 0,0, 1,1 ,2,2 to rows-1, columns-1
    int i = 0;
    int j = 0;
    while (i < rows)
    {
        while (j < columns)
        {
            diagonal1 += arr[i][j];
            j++;
            i++;
        }
    }

    // Diagonal 2 - right to left
    // Diagonal 2 starts in 0, columns-1, 1, columns-2 ... to rows-1, 0
    i = 0;
    j = columns - 1;
    while (i < rows)
    {
        while (j >= 0)
        {
            diagonal2 += arr[i][j];
            j--;
            i++;
        }
    }
    //endregion;

    //region print outputs to screen
    System.out.println("Sum of diagonals = " + (diagonal1 + diagonal2));
    //endregion;
    }
}
