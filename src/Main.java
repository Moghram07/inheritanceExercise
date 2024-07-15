//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println("Shape1 " + shape1);
        Shape shape2 = new Shape("purple", true);
        System.out.println("Shape2 :with parameters :" + shape2);
        shape1.setColor("Blue");
        shape1.setFilled(false);
        System.out.println("update shape1: "+ shape1);
        // Test Circle class
        Circle circle1 = new Circle();
        System.out.println("Circle 1 : " + circle1);

        Circle circle2 = new Circle(3.5);
        System.out.println("Circle 2 : " + circle2);

        Circle circle3 = new Circle(2.0, "Green", false);
        System.out.println("Circle 3 : " + circle3);

        circle1.setRadius(4.2);
        System.out.println("Circle 1 - Updated Radius: " + circle1);

        circle3.getArea();

        // Test Rectangle class
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1 : " + rectangle1);

        Rectangle rectangle2 = new Rectangle(5.0, 10.0);
        System.out.println("Rectangle 2 : " + rectangle2);

        Rectangle rectangle3 = new Rectangle(3.0, 6.0, "Yellow", true);
        System.out.println("Rectangle 3 : " + rectangle3);

        rectangle1.setWidth(7.5);
        rectangle1.setLength(4.0);
        System.out.println("Rectangle 1 - Updated Width and Length: " + rectangle1);

        rectangle2.getArea();

        // Test Square class
        Square square1 = new Square();
        System.out.println("Square 1 : " + square1);

        Square square2 = new Square(5.0);
        System.out.println("Square 2 : " + square2);

        Square square3 = new Square(4.0, "Purple", false);
        System.out.println("Square 3 : " + square3);

        square1.setSide(6.0);
        System.out.println("Square 1 - Updated Side Length: " + square1);

        square2.getArea();
    }
}