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

        String phnumber = "353831871363";

        String countrycode = phnumber.substring(0, 3);
        String operator = phnumber.substring(3,5);
        String number = phnumber.substring(5);

        System.out.println(countrycode);
        System.out.println(operator);
        System.out.println(number);

    }
}