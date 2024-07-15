public class Circle extends Shape{

    private double radius = 1.0;

    Circle(){

    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void getArea(){
        double area = radius * radius * Math.PI;
        System.out.println("Circle area = "+ area);
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}
