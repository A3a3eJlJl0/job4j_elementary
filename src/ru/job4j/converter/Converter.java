package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);

        float expectedEuro = 2.f;
        float expectedDollar = 2.f;

        boolean passed = expectedEuro == euro;
        System.out.println("Euro test passed: " + passed);

        passed = expectedDollar == dollar;
        System.out.println("Dollar test passed: " + passed);
    }
}
