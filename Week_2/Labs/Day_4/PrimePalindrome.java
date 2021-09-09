package Week_2.Labs.Day_4;
import java.util.*;
public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sInt = new Scanner(System.in);

        int num = sInt.nextInt();
        boolean primePalindrome = false;
        int i = num;
        while (!primePalindrome)
        {
                if (isPrime(i))
                {

                    if (isPalindrome(Integer.toString(i)))
                    {
                        primePalindrome = true;
                        System.out.println("The next prime palindrome is " + i);
                    }
                }
            i++;
        }
    }

    public static boolean isPrime (int num)
    {
        boolean isPrime = true;
        for (int i = 2; i <= num/2; i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
            }
        }

        return isPrime;
    }

    public static boolean isPalindrome (String input)
    {
        input = input.toUpperCase();
        String reverse = "";

        for (int i = input.length()-1; i >= 0; i--)
        {
            reverse += input.charAt(i);
        }

        if (input.equals(reverse))
        {
            // System.out.print(input + " is a palindrome.");
            return true;
        }
        else
        {
            // System.out.print(input + " is NOT a palindrome.");
            return false; 
        }
    }
}
