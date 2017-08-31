
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    
    /**
     * This function finds the area of a triangle when the base and the height are given.
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * This function finds the area of a rectangle.
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * This function finds the volume of a sphere.
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * This function finds the area of a parallelogram.
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }

    /**
     * This function finds the area of a trapezoid.
     */
    public static double trapezoidArea(double baseone, double basetwo, double height) 
    {
        return (baseone + basetwo) * height / 2.0;
    }

    /**
     * This function finds the volume of a rectangular prism.
     */
    public static double rectangularPrismVolume(double length, double width, double height) 
    {
        return length * width * height;
    }

    /**
     * This function finds the volume of a cone.
     */
    public static double coneVolume(double radius, double height) 
    {
        return Math.PI * height * Math.pow(radius, 2) / 3.0;
    }

    /**
     * This function finds the surface area of a rectangular prism.
     */
    public static double rectangularPrismSurfaceArea(double length, double width, double height) 
    {
        return 2.0 * ((width * length) + (height * length) + (height * width));
    }

    /**
     * This function finds the surface area of a sphere.
     */
    public static double sphereSurfaceArea(double radius) 
    {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * This function finds the hypotenuse of a right triangle given the lengths of the other two sides.
     */
    public static double hypotenuse(double legone, double legtwo) 
    {
        return Math.sqrt(Math.pow(legone, 2) + Math.pow(legtwo, 2));
    }

    /**
     * This function finds the distance between two points.
     */
    public static double distance(double xone, double yone, double xtwo, double ytwo) 
    {
        return Math.sqrt(Math.pow(xone - xtwo, 2) + Math.pow(yone - ytwo, 2));
    }

    /**
     * This function finds the slope of a line using two points.
     */
    public static double slope(double xone, double yone, double xtwo, double ytwo) 
    {
        double rise = ytwo - yone;
        double run = xtwo - xone;
        return rise / run;
    }

    /**
     * This function finds the area of a triangle when given the lengths of all three sides.
     */
    public static double triangleAreaSides(double sidea, double sideb, double sidec) 
    {
        double p = (sidea + sideb + sidec) / 2.0;
        return Math.sqrt(p * (p - sidea) * (p - sideb) * (p - sidec));
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
        
        double ssa1 = sphereSurfaceArea(14);
        System.out.println(ssa1);
        
        double h1 = hypotenuse(3, 4);
        System.out.println(h1);
        
        double d1 = distance(3, 4, 6, 7);
        System.out.println(d1);
        
        double m1 = slope(5, 2, 9, 4);
        System.out.println(m1);
        
        double tas1 = triangleAreaSides(3, 6, 8);
        System.out.println(tas1);
    }
}
