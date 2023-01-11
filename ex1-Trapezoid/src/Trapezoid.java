public class Trapezoid {
    private double smallWidth;
    private double bigWidth;
    private double height;
    private double side1;
    private double side2;

    public Trapezoid(double smallWidth, double bigWidth, double height, double side1, double side2) {
        this.smallWidth = smallWidth;
        this.bigWidth = bigWidth;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    public double getPerimeter() {
        return smallWidth + bigWidth + side1 + side2;
    }
    public double getArea() {
        return (smallWidth + bigWidth)* height/2;
    }

    @Override
    public String toString() {
        return  "smallWidth = " + smallWidth +
                ", bigWidth = " + bigWidth +
                ", height = " + height +
                ", side1 = " + side1 +
                ", side2 = " + side2 ;
    }
}
