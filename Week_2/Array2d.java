package Week_2;
import java.util.*;
public class Array2d {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
        
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        char c = '*';
        String cHolder = "*";

        //region Allow user to select number of rows and columns
        System.out.println("Enter the number of rows of data you would like to enter");
        rows = sc.nextInt();

        System.out.println("Enter the number of columns of data you would like to enter");
        columns = sc.nextInt();

        sc.reset();

        System.out.println("Enter the character you would like to fill the array with");
        cHolder = scString.nextLine();
        if (sc.hasNextLine())
        {
        c = cHolder.charAt(0);
        }

        sc.close();
        scString.close();
        char [] [] arr = new char [rows] [columns];

        //endregion;

        //region populate array
        for (int i = 0; i < rows; i++)
        {
            
            for (int j = 0; j < columns; j++)
            {
                arr [i] [j] = c;
            }
        }
        //endregion;

        //region print array
        for (int i = 0; i < rows; i++)
        {
            System.out.print("Row " +i+": [ ");
            for (int j = 0; j < columns; j++)
            {
                if (j == 0)
                {
                    System.out.print(arr [i] [j]);
                }
                else
                {
                    System.out.print(", " + arr [i] [j]);
                }

            }
            System.out.println(" ]");
        }
        //endregion;
    }
    
}
