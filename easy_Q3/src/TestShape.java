/**
 * @Author Lui
 * @create 2018-09-20-19:50
 **/
public class TestShape {
    public static void main(String[] args) {

        Circle circle;
        Rectangle rectangle;

        circle = new Circle(22,8,3.5);
        rectangle = new Rectangle( 7.5, 2, 18 , 11);

        System.out.print(circle.getName() + ": " + circle.toString());
        System.out.print("; Radius = " + circle.get__radius());
        System.out.println("; Area = " + circle.getArea());


        System.out.println("set the Radius of circle to 4");
        circle.setRadius(4);
        System.out.println("set the Center coordinates  of circle to X:30  y:10");
        circle.setCenter(30,10);
        System.out.println("get the existing Center coordinates");
        circle.getCenter();

        System.out.print(circle.getName() + ": " + circle.toString());
        System.out.print("; Radius = " + circle.get__radius());
        System.out.println("; Area = " + circle.getArea());


        System.out.println("========================================");
        System.out.print(rectangle.getName() +
                ": " + rectangle.toString());
        System.out.print("; Length = " + rectangle.getLength());
        System.out.print("; Width = " + rectangle.getWidth());
        System.out.println("; Area = " + rectangle.getArea());



        System.out.println("set the length of rectangle to 10");
        rectangle.setLength(10); //new length = 10

        System.out.println("set the wight of rectangle to 20");
        rectangle.setWidth(20); //new Width = 20

        System.out.println("set the topleft  of rectangle to 50 and 30");
        rectangle.setTopleft(50.0, 30.0);

        System.out.println("get the existing topleft");
        rectangle.getTopleft();
        System.out.println("get the existing Width");
        System.out.println(rectangle.getWidth());
        System.out.println("get the existing Length");
        System.out.println(rectangle.getLength());;
        System.out.println("get the existing Topleft");
        rectangle.getTopleft();


        System.out.print("Length = " + rectangle.getLength());
        System.out.print("; Width = " + rectangle.getWidth());
        System.out.println("; Area = " + rectangle.getArea());


    }
}
