/**
 * @Author Lui
 * @create 2018-09-20-  21:39
 **/
public class Rectangle extends Shape {
    Point topleft;
    private double length;
    private double width;
    private Point shape;
    public Rectangle() { super("Rectangle"); }

    public Rectangle(double x, double y, double Length,double Width)
    {
        super("Rectangle");
        topleft = new Point(x, y);
        this.length = Length;
        this.width = Width;
    }

    public void setLength(double length) { this.length = length; }

    public double getLength() { return length ; }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width ; }

    public void setTopleft(double top, double left) { topleft.setPoint(top, left) ; }

    public void getTopleft()
    {
        System.out.println(this.topleft.getX());
        System.out.println(this.topleft.getY());
    }

    public String toString() { return topleft.toString() ; }

    @Override
    public double getArea() { return this.length*this.width ; }
}
