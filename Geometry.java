
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }

    public static double trapezoidArea(double baseone, double basetwo, double height) 
    {
        return (baseone + basetwo) * height / 2.0;
    }

    public static double rectangularPrismVolume(double length, double width, double height) 
    {
        return length * width * height;
    }

    public static double coneVolume(double radius, double height) 
    {
        return Math.PI * height * Math.pow(radius, 2) / 3.0;
    }

    public static double rectangularPrismSurfaceArea(double length, double width, double height) 
    {
        return 2.0 * ((width * length) + (height * length) + (height * width));
    }

    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
        
        double pa1 = parallelogramArea(4.0, 6.0);
        System.out.println(pa1);
        
        double tra1 = trapezoidArea(9.0, 13.0, 5.0);
        System.out.println(tra1);
        
        double rpv1 = rectangularPrismVolume(3, 10, 6);
        System.out.println(rpv1);
        
        double cv1 = coneVolume(7, 12);
        System.out.println(cv1);
        
        double rpsa1 = rectangularPrismSurfaceArea(5.0, 9.0, 8.0);
        System.out.println(rpsa1);
    }
}
