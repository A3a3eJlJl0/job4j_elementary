package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(100, 200, 100, 200);
        double result3 = Point.distance(1, 5, 2, 8);

        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (100, 200) to (100, 200) " + result2);
        System.out.println("result (1, 5) to (2, 6) " + result3);
    }
}
