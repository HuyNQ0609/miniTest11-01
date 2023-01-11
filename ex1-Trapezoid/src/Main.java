public class Main {
    public static void main(String[] args) {
        Trapezoid trapezoid1 = new Trapezoid(6, 10, 8, 9, 14);
        System.out.println("Trapezoid 1: " + trapezoid1);
        double perimeter1 = trapezoid1.getPerimeter();
        double area1 = trapezoid1.getArea();

        Trapezoid trapezoid2 = new Trapezoid(7, 11, 10, 15, 19);
        System.out.println("Trapezoid 2: " +trapezoid2);
        double perimeter2 = trapezoid2.getPerimeter();
        double area2 = trapezoid2.getArea();

        System.out.println(Perimeter(perimeter1, perimeter2));
        System.out.println(Area(area1, area2));
    }
    //*-----------------Perimeter----------------*//
    public static String Perimeter(double perimeter1, double perimeter2) {
        if (perimeter1 > perimeter2) {
            return "Perimeter of trapezoid 1 is bigger than trapezoid 2!";
        } else if (perimeter1 < perimeter2) {
            return "Perimeter of trapezoid 2 is bigger than trapezoid 1!";
        } else {
            return "Perimeter of two figures are equal!";
        }
    }
    //*------------------Area------------------*//
    public static String Area(double area1, double area2) {
        if (area1 > area2) {
            return "Area of trapezoid 1 is bigger than trapezoid 2!";
        } else if (area1 < area2) {
            return "Area of trapezoid 2 is bigger than trapezoid 1!";
        } else {
            return "Area of two figures are equal!";
        }
    }
}