package uk.co.randomdave;

public class AreaCalculator {

    public static void main(String[] args) {

    }

    public static double area (double radius) {
        //validation
        if (radius < 0) return -1D;

        return radius * radius * Math.PI;
    }

    public static double area (double x, double y) {
        //validation
        if (x < 0 || y < 0) return -1d;

        return x * y;
    }
}
