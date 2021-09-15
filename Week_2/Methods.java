package Week_2;
import java.util.*;
public class Methods {
    public static void main(String[] args) {
        int num = 6;
        Scanner sInt = new Scanner(System.in);
        Scanner sString = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even");
        num = sInt.nextInt();
        sInt.close();

        checkEven(num);
        
        System.out.println("Enter a word to check if it's a palindrome");
        String input = sString.nextLine();
        sString.close();
        isPalindrome(input);
        
    }

    public static boolean checkEven (int num)
    {
        if (num % 2 == 0)
        {
            System.out.println(num + " is even");
            return true;
        }
        else
        {
            System.out.println(num + " is NOT even");
            return false;
        }
    }

    public static boolean isPalindrome (String input)
    {
        input = input.toLowerCase();
        String reverse = "";

        for (int i = input.length()-1; i <= 0; i++)
        {
            reverse += input.charAt(i);
        }

        if (input.compareTo(reverse) == 0)
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
