package Week_2.Labs.Day_4;
import java.util.*;
public class VariousArrayTasks {
    public static void main(String[] args) {
        int[] arr = fillArray();
        int sum = sumArray(arr);
        Double avg = avgArray(arr);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        printArray(arr);
    }

    public static int[] fillArray()
    {
        Scanner sInt = new Scanner(System.in);
        System.out.println("Enter the length of the array you wish to enter");
        int leng = sInt.nextInt();
        int[] arr = new int[leng];
        for (int i = 0; i < leng; i++)
        {
            arr[i] = sInt.nextInt();
        }
        sInt.close();
        return arr;
    }

    public static int sumArray(int[] arr)
    {
        //This method sums an array and returns the sum
        int sum = 0;
        for (int i : arr)
        {
            sum += i;
        }
        
        return sum;
    }

    public static Double avgArray(int[] arr)
    {
        //This method calculates the average of the array and returns a double
        Double avg = 0.00;

        for (int i : arr)
        {
            avg += i;
        }

        avg = avg / arr.length;
        
        return avg;
    }

    public static void printArray(int[] arr)
    {
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
