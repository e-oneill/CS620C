package Week_2.Labs.Day_2;

import java.util.*;
public class arraySwap
{
    public static void main(String[] args) {
        int arr [] = new int[5];
        int temp = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Please enter the item for index [" + i + "] for array");
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
            
        }   
        System.out.println();     

        temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
            
        } 
        System.out.println();  






    }
}