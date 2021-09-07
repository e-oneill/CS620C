package Week_2.Labs.Day_1;
import java.util.*;
public class aandb {
    public static void main(String[] args) {
        //Init
        Scanner sc = new Scanner(System.in);
        String str = "";
        int aCount = 0;
        int bCount = 0;
        //region Input handling
        str = sc.nextLine();
        int leng = str.length();
        sc.close();
        //endregion;

        //region Operation
        for (int i = 0; i < leng; i++)
        {
            if (str.charAt(i) == 'a')
            {
                aCount++;
            }
            else if (str.charAt(i) == 'b')
            {
                bCount++;
            }
        }

        System.out.println(aCount + " a's and " + bCount + " b's");
        if (aCount == bCount)
        {
            System.out.println("Match");
        }
        else
        {
            System.out.println("No match");
        }
        //endregion;
    }
}
