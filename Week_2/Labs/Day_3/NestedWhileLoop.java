package Week_2.Labs.Day_3;

public class NestedWhileLoop {
    public static void main(String[] args) {
        //region Set character and limits
        char c = '#';
        int count = 5;
        int i = 1;
        int j = 1;
        // int row = 1;
        //endregion;

        while (i <= count)
        {
            j = 1;
            while (j <= i)
            {
                System.out.print(c);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
