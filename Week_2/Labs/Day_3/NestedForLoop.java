package Week_2.Labs.Day_3;

public class NestedForLoop {
    public static void main(String[] args) {
        //region Init Variable to set limit on for loops
        int rows = 12;
        int columns = 12;
        int prod = 0;
        //endregion;

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= columns; j++)
            {
                prod = i*j;
                System.out.println(i + " * " + j + " = " + prod);
            }
        }


    }
}
