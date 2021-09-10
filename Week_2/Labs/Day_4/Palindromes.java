package Week_2.Labs.Day_4;
import java.util.*;
public class Palindromes {
    public static void main(String[] args) {
        Scanner sString = new Scanner(System.in);

        String input = sString.nextLine();
        sString.close();
        isPalindrome(input);
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
            System.out.print(input + " is a palindrome.");
            return true;
        }
        else
        {
            System.out.print(input + " is NOT a palindrome.");
            return false; 
        }
    }
}
