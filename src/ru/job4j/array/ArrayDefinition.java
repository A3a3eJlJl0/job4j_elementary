package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Evgenii";
        names[1] = "Petr";
        names[2] = "Ivan";
        names[3] = "Alex";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("ages size: " + ages.length);
        System.out.println("surnames size: " + surnames.length);
        System.out.println("prices size: " + prices.length);
    }
}
