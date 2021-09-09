package Week_2.Labs.Day_4;
import java.util.*;
public class Primes {
    public static void main(String[] args) {
        Scanner sInt = new Scanner(System.in);

        int num = sInt.nextInt();

        Boolean isPrime = isPrime(num);

        if (isPrime)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is NOT a prime number");
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
}
