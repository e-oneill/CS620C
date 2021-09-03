public class leapyear
{
    public static void main(String[] args) {
        int year = 2020;

        for (int i = year; i <= year+100; i++)
        {
            // Condition 1
            if (i % 400 == 0)
            {
                System.out.println(i + " is a leap year");
                continue;
            }
            
            // Condition 2         
            if (i % 4 == 0 & i % 100 != 0)
            {
                System.out.println(i + " is a leap year");
                continue;
            }

            System.out.println(i + " is NOT a leap year");
        }
    }
}