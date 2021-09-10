package Week_2.Labs.Day_4;
import java.util.*;
public class Stars {
    public static void main(String[] args) {
        int count = 0;
        Scanner sInt = new Scanner(System.in);

        count = sInt.nextInt();
        sInt.close();
        printStars(count);
    }

    public static void printStars (int count)
    {
        int row = 1;
        for (int i = 0; i < count; i++)
        {
            
            for (int j = 0; j < row; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            row++;
        }
    }
}
