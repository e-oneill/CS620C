package Week_2.Labs.Day_1;
import java.util.*;

public class Compare {
    public static void main(String[] args) {
        //Init
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two integers, one after the other.");

        //region Declare Variables that will be needed
        int num1 = 0;
        int num2 = 0;
        //endregion;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();

        if (num1 > num2)
        {
            System.out.println(num1 +  " > " + num2);
        }
        else if (num2 > num1)
        {
            System.out.println(num1 + " < " + num2);
        }
        else
        {
            System.out.println(num1 + " = " + num2);
        }
    }
}
