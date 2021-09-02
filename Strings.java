public class Strings
{
    public static void main(String[] args) {
        String s1 = "Mule"; 
        String s2 = "Mule", s3 = s1 + " " + s2;
        // int num1 = 10, num2 = 12;

        // System.out.println(s1 + s2);
        
        // System.out.println(num1 + num2);

        // System.out.println(s1 + s2 + num1 + num2);

        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));

        String phnumber = "353872671278";

        String countrycode = phnumber.substring(0, 3);
        String operator = phnumber.substring(3,5);
        String number = phnumber.substring(5);

        if (operator.charAt(0) == '8')
        {
            operator = 0 + operator;
        }
        else
        {
            operator = operator.substring(1);
        }

        System.out.println(countrycode);
        System.out.println(operator);
        System.out.println(number);

        String firstname = "Mary";
        String surname = "Reid";
        String year = "2019";

        String email = firstname + "." + surname + "." + year + "@mumail.ie";
        System.out.println(email);

    }
}