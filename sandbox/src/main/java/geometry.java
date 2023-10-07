public class geometry {
    public static void main(String[] args) {
        printSquareArea(7.0);
        printSquareArea(5.0);
        printSquareArea(3.0);

        printRectangleArea(3.0, 5.0);
        printRectangleArea(8.0, 6.0);
    }

    private static void printRectangleArea(double v, double v1) {
        System.out.println("Площадь Rectangle со стороной " + v + " и " + v1 + " = " + RectangleArea(v, v1));
    }

    private static double RectangleArea(double v, double v1) {
        return  v * v1;
    }

    static void printSquareArea(double a) {
        System.out.println("Площадь квадрата со стороной " + a + " = " + SquareArea(a));
    }

    private static double SquareArea(double a) {
        return a * a;
    }
}
