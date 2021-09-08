package Week_2.Labs.Day_2;
import java.util.*;
public class AddElements {
    public static void main(String[] args) {
        //region Initialize scanner
        Scanner sc = new Scanner(System.in);
        //endregion;

        //region Handle User Input and fill Array
        Double[] arr = new Double[10];
        Double lastDouble = 0.00;
        Double sum = 0.00;

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextDouble();
            if (i > 0)
            {
                sum = (double)Math.round((arr[i] + lastDouble) * 100) / 100;
                System.out.println(arr[i] + " + " + lastDouble + " = " + sum);
            }
            lastDouble = arr[i];
        }
        //endregion;

        sc.close();


    }
}
