package Week_3.Labs.Day_1;
// import java.lang.Math.*;
public class BasicCircle {
    //Attributes
    private int radius;

    //Default Constructor
    public BasicCircle()
    {
        radius = 1;
    }

    //Attribute Assignment Constructor
    public BasicCircle(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public double getCircumference()
    {
        double circumference = 0.00;

        // circumference = 2 * Math.PI * radius;
        circumference = Math.round((2 * Math.PI * radius) * 100.0) / 100.0;
        return circumference;
    }

    public double getArea()
    {
        double area = 0.00;

        // area = Math.PI * Math.pow(radius, 2.0);
        area = Math.round((Math.PI * Math.pow(radius, 2.0)) * 100.0) / 100.0;
        return area;
    }
}
