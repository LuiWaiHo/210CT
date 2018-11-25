/**
 * @Author Lui
 * @create 2018-09-20- 19:35
 **/
// Definition of abstract base class Shape
public abstract class Shape {

    protected String name;

    public Shape(String n) {
        name = new String(n);
    }

    public abstract double getArea();

    public String getName() {return name;}

}
