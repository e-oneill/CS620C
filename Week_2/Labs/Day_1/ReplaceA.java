package Week_2.Labs.Day_1;
import java.util.*;
public class ReplaceA {
    public static void main(String[] args) {
        
        //region Init
        Scanner sc = new Scanner(System.in);
        String str = "";
        int aCount = 0;
        //endregion;

        //region Input Handling
        str = sc.nextLine();
        int leng = str.length();
        sc.close();
        // String lowStr = str.toLowerCase();
        //endregion;

        //region Operation
        // Start by counting the a's in the string
        for (int i = 0; i < leng; i++)
        {
            if (str.charAt(i) == 'a')
            {
                aCount++;
            }
        }

        // Next carry out the replacement
        if (aCount <= 3)
        {
            str = str.replace('a','#');
        }
        else
        {
            str = str.replace('a','@');
        }

        System.out.println(str);
        //endregion


    }
    
}
