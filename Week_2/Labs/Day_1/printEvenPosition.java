package Week_2.Labs.Day_1;
import java.util.*;
public class printEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("");
        
        //region User Input handling
        System.out.println("Please enter a string.");
        str = sc.nextLine();
        sc.close();
        //endregion;

        //region Operation on string
        for (int i = 0; i < str.length(); i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(str.charAt(i));
            }
        }
        //endregion;


    }
    
}
