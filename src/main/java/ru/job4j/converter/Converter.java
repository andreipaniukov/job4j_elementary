package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        value = value / 70;
        return value;
    }

    public static float rubleToDollar(float value) {
        value = value / 60;
        return value;
    }

    public static void main(String[] args) {

        float in = 420;

        float expectedEuro = 6;
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("420 rubles are 6 euros. Test result: " + passedEuro);

        float expectedDollar = 7;
        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("420 rubles are 7 dollars. Test result: " + passedDollar);

    }
}
