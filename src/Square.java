public class Square extends Rectangle{
   // private double side;
    Square(){
    }
    Square(double side){
        super.setWidth(side);
    }
    Square(double side, String color, boolean filled){
        super(side, side,color, filled);

    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
    }

    public void getArea(){
        double area = super.getWidth() * super.getWidth();
        System.out.println("Square area : "+ area);
    }


    @Override
    public String toString() {
        return "Square[side=" + super.getWidth() + ", " + super.toString() + "]";
    }
}
