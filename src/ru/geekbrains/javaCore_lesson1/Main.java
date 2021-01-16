package ru.geekbrains.javaCore_lesson1;
import java.util.Scanner;


public class Main {
    // Задание №1
    public static void main(String[] args) {

        // Задание №2
        byte a = 20;
        short b = 2000;
        int c = 40000;
        long d = 20000000L;
        float e = 13.12345345f; // Что значит "число с плавающей запятой одинарной точности"
        double f = 138.1342d; // Что значит "число с плавающей запятой двойной точности"
        char g = 'Z';
        boolean val = true;
        String text = "Hello!";
        int x = (int) (Math.random() * 15);
        int y = (int) (Math.random() * 15);
        int x1 = (int) (Math.random() * 20 - 10);
        int x2 = (int) (Math.random() * 20 - 10);


        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n" + val + "\n" + text + "\n"); // Задание №2
        System.out.println("Результат вычисления: " + calculate(1.22f,5.54f,46.02f,5.60f)); // Задание №3
        System.out.println("Это число от 10 до 20 ? " + checkSum(x, y)); // Задание №4
        number(x1); // Задание №5
        System.out.println("Чтисло " + x2 + " положительное" + defineNumber(x2)); //Задание №6
        name("Егорка"); // Задание №7
        mysticYear(); // Задание №8

    }

    // Задание №3
    private static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // Задание №4
    private static boolean checkSum(int x, int y) {
        int minValue = 10;
        int maxValue = 20;
        int sum = x + y;
        System.out.println("Сумма чисел " + sum);
        return (sum <= 20 && sum >= 10);

    }

    // Задание №5
    private static void number(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else {
            System.out.println("Число " + x + " отрицательное");
        }

    }

    // Задание №6
    private static boolean defineNumber(int x) {
        return (x >= 0);
    }

    // Задание №7
    private static void name(String x) {
        System.out.println("Привет, " + x + "!");
    }

    // Задание №8
    private static void mysticYear() {
        int currentYear = 2000;
        if (currentYear % 4 == 0 && currentYear % 100 !=0 || currentYear % 400 == 0) {
            System.out.println(currentYear + " год - високосный!");
        } else {
            System.out.println(currentYear + " год - не високосный.");
        }


    }
}



