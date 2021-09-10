package Week_2;
import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {
      Scanner sInt = new Scanner(System.in);
      
      System.out.println("Insert integer of month");
      int month = sInt.nextInt();
      sInt.close();
      System.out.println("The Season is " + printSeason(month));
    }

    public static String printSeason(int Month)
    {
        String season = "";
        switch (Month)
        {
            case 12:
            case 1:
            case 2:
            season = "Winter";
            return season;
            case 3: 
            case 4:
            case 5:
            season = "Spring";
            return season;
            case 6:
            case 7:
            case 8:
            season = "Summer";
            return season;
            case 9:
            case 10:
            case 11:
            season = "Autumn";
            return season;
            default:
            season = "Invalid";
            return season;
        }
    }
}
