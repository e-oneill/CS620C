package Week_3.Labs.Day_1;
import java.util.*;
public class TestBasicCircle {
    public static void main(String[] args) {
        Scanner sInt = new Scanner(System.in);

        BasicCircle[] circles = new BasicCircle [3];
        
        for (int i = 0; i < circles.length; i++)
        {
            int radius = sInt.nextInt();
            circles[i] = new BasicCircle();
            circles[i].setRadius(radius);
        }

        sInt.close();

        for (int i = 0; i < circles.length; i++)
        {
            int radius = circles[i].getRadius();
            System.out.println("Circle " + (i+1) + " has a radius of " + radius);
        }

        for (int i = 0; i < circles.length; i++)
        {
            double circumference = circles[i].getCircumference();
            System.out.println("Circle " + (i+1) + " has a circumference of " + circumference);
        }

        for (int i = 0; i < circles.length; i++)
        {
            double area = circles[i].getArea();
            System.out.println("Circle " + (i+1) + " has an area of " + area);
        }

    }
}
