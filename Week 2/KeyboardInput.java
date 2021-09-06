import java.util.*;
//import java.util.Scanner; // More specific import for Scanner only

public class KeyboardInput
{
    public static void main(String[] args) {
        //region setting up variables and classes as needed
        // Have to define Scanner class to get input
        Scanner sc = new Scanner(System.in);
        String fname, sname;

        //endregion;

        //region User Inputs
        System.out.println("ENTER FORENAME:");
        fname = sc.nextLine();

        System.out.println("ENTER SURNAME:");
        sname = sc.nextLine();

        //Closing the Scanner after input is received
        sc.close();
        //endregion;
        
        

        System.out.println("Name Provided:" + fname + " " + sname);

    }
}