import java.util.*;
// import java.lang.*;
public class PhoneNumberEntry
{
    public static void main(String[] args) {
        //region Variable Definition
        Scanner sc = new Scanner(System.in);
        String phnumber = new String("");

        //endregion;

        //region Input handling
        System.out.println("Input Phone Number: \n" + "(Number must be exactly 12 digits and should include 3-digit country code followed by 9-digit phone number");
        phnumber = sc.nextLine();
        while (phnumber.length() != 12)
        {

            System.out.println("Number provided is not 12-digits. Please provide a valid phone number. To cancel operation, type END");
            phnumber = sc.nextLine();
            if (phnumber.toUpperCase().equals("END"))
            {
                System.exit(0);
            }
            // System.out.println(phnumber);

        }
        //endregion;

        //region String manipulation and breakdown
        
        String countrycode = phnumber.substring(0, 3);
        String operator = phnumber.substring(3,7);
        String number = phnumber.substring(5);

        if (operator.charAt(0) == '8')
        {
            operator = 0 + operator.substring(0,2);
            number = phnumber.substring(5);
        }
        else
        {
            operator = operator.substring(1);
            number = phnumber.substring(7);
        }

        System.out.println("Country code: " + countrycode);
        System.out.println("Operator code: " + operator);
        System.out.println("Phone number: " + number);

        String fullnumber = "(" + countrycode + ") " + operator + " " + number;
        System.out.println(fullnumber);
        //endregion;

    }
}