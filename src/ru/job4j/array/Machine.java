package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int counter = 0;
        int balance = money - price;

        for (int coin : coins) {
            while (balance - coin >= 0) {
                balance -= coin;
                result[counter++] = coin;
            }
        }
        int size = counter;
        return Arrays.copyOf(result, size);
    }
}
