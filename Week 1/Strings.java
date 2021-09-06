public class Strings
{
    public static void main(String[] args) {
        // String s1 = "Mule"; 
        // String s2 = "Mule", s3 = s1 + " " + s2;
        // int num1 = 10, num2 = 12;

        // System.out.println(s1 + s2);
        
        // System.out.println(num1 + num2);

        // System.out.println(s1 + s2 + num1 + num2);

        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));


        //region Dividing a given phone number into its component parts.
        String phnumber = "35316701784";

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

        System.out.println(countrycode);
        System.out.println(operator);
        System.out.println(number);
        //endregion;
        
        //region Generating an email address by connecting string variables.
        String firstname = "Mary";
        String surname = "Reid";
        String year = "2019";       

        String email = firstname + "." + surname + "." + year + "@mumail.ie";
        System.out.println(email);
        //endregion;

        //region Using indexOf() to extract student details from a given email address.
        String fname = email.substring(0, email.indexOf('.'));
        int endOfFname = email.indexOf('.');
        String sname = email.substring(endOfFname+1,email.indexOf('.', endOfFname+1));
        int endOfSname = email.indexOf('.', endOfFname+1);
        String yr = email.substring(endOfSname+1,email.indexOf('@'));

        System.out.println("forename: " + fname);
        System.out.println("surname: " + sname);
        System.out.println("year of enrolment: " + yr);
        //endregion;
        

    }
}