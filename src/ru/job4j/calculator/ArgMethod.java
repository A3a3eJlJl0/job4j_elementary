package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello() {
        System.out.println("Hello, user.");
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ". Are you " + age + " years old?");
    }

    public static void hello(int age) {
        System.out.println("Are you " + age + " years old?");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello();

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);
    }
}
