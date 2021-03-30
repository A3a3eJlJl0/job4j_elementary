package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] functionValues = new int[5];

        for (int i = 0; i < functionValues.length; i++) {
            functionValues[i] = i * 2 + 3;
        }

        for (int value: functionValues) {
            System.out.println(value);
        }
    }
}
