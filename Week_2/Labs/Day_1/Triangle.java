package Week_2.Labs.Day_1;
import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double sideA = 0.00;
        Double sideB = 0.00;
        Double sideC = 0.00;

        // Input
        
        sideA = sc.nextDouble();
        sideB = sc.nextDouble();
        sideC = sc.nextDouble();
        sc.close();

        // Operation
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB)
        {
            if (Double.compare(sideA, sideB) == 0 & Double.compare(sideA, sideC) == 0)
            {
                System.out.println("This is an equilateral triangle");
            }
            else if (Double.compare(sideA, sideB) == 0 & Double.compare(sideA, sideC) != 0 || 
            Double.compare(sideA, sideB) != 0 & Double.compare(sideA, sideC) == 0 ||
            Double.compare(sideB, sideC) == 0 & Double.compare(sideA, sideB) != 0)
            {
                System.out.println("This is an isosceles triangle.");
            }
            else 
            {
                System.out.println("This is a scalene triangle");
            }
        }
        else
        {
            System.out.println("This is not a triangle.");
        }
    }
}
