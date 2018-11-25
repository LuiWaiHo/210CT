import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lui
 * @create 2018-09-20- 19:36
 **/
public class Circle extends Shape{
    private double radius;
    List<String> x_y = new ArrayList<>();
    private Point __radius;

    public Circle(double x, double y, double rad)
     {
         //declare the named Circle
        super("Circle");
        this.__radius = new Point(x ,y);
        this.radius = rad;
     }

     public String toString() { return this.__radius.toString() ; }

     public void setRadius(double rad ) { this.radius = rad ; }

     public double get__radius() { return  this.radius ; }

     public void setCenter(double x, double y ) { __radius.setPoint(x,y) ; }

     public void  getCenter()
     {
         System.out.println("the x is :"+ __radius.getX());
         System.out.println("the y is :"+ __radius.getY());
     }

     @Override
     public double getArea() { return 3.14159*(this.radius *this.radius) ; }
}
