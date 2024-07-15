public class Square extends Rectangle{
    private double side;
    Square(){
    }
    Square(double side){
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        super(side, side,color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void getArea(){
        double area = side * side;
        System.out.println("Square area : "+ area);
    }


    @Override
    public String toString() {
        return "Square[side=" + side + ", " + super.toString() + "]";
    }
}
