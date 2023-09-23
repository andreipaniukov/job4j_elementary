package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        short p = 4;
        short k = 1;
        double result1 = SqArea.square(p, k);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
