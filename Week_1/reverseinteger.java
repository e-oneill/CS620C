package Week_1;
public class reverseinteger
{
    public static void main(String[] args) {
        int num1 = 921225555;
        int remember = num1;
        int num2 = 0;
        int numreverse = 0;
        int digitcount = digitcounter(num1);

        int digithandler = 0;

        while (digithandler < digitcount)
        {
            num2 = num1 % 10;
            num1 = num1 / 10;
            numreverse = numreverse * 10;
            numreverse += num2;
            // System.out.print(num2);
            digithandler++;
        }

        System.out.println("Reverse of " + remember + " is " + numreverse);
    }

    public static int digitcounter(int num1)
    {
        int digitcount = 0;
        if (num1 < 10000)
        {
            if (num1 < 100)
            {
                if (num1 < 10)
                {
                    digitcount = 1;
                }
                else
                {
                    digitcount = 2;
                }
            }
            else if (num1 < 1000)
            {
                digitcount = 3; 
            }
            else 
            {
                digitcount = 4;
            }
        }
        else if (num1 < 100000)
        {
            digitcount = 5;
        }
        else if (num1 < 1000000)
        {
            digitcount = 6;
        }
        else if (num1 < 10000000)
        {
            digitcount = 7;
        }
        else if (num1 < 100000000)
        {
            digitcount = 8;
        }
        else if (num1 < 1000000000)
        {
            digitcount = 9;
        }
        else
        {
            System.out.println("Invalid integer provided");
            System.exit(0); 
        }

        return digitcount;
    }

}