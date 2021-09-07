package Week_2.Labs.Day_1;
import java.util.*;
public class Capital {
    public static void main(String[] args) {
        //region Init

        Scanner sc = new Scanner(System.in);
        String str = "";
        char first = ' ';
        //endregion;

        //region Input Handling
        str = sc.nextLine();
        str = str.toLowerCase();
        sc.close();
        int leng = str.length();
        // int lastWord = 0;
        //endregion;

        //region Operation
        for (int i = 0; i < leng; i++)
        {
            if (i == 0)
            {
                first = str.charAt(i);
                first = Character.toUpperCase(first);
                str = first + str.substring(1);                 
            }
            else if (str.charAt(i) == ' ')
            {

                first = str.charAt(i+1);
                first = Character.toUpperCase(first);
                str = str.substring(0, i+1) + first + str.substring(i+2);
            }
        }

        System.out.println(str);
        //endregion;
    }
}
