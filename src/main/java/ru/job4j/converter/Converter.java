package ru.job4j.converter;

public class Converter {

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rubleToEuro(float value) {
        float rls = value / 70;
        return rls;
    }

    public static void main(String[] args) {
        float dollar = Converter.rubleToDollar(140);
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("140 rubles are " + euro + " euro.");
    }
}
