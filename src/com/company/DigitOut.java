package com.company;

public class DigitOut {
    public static void main(String[] args) {

        System.out.println("Вывод чисел 1...10 на экран: ");

        int k = 11;
        for (int i = 10; i > 0; i--) {
            System.out.println(k-i);
        }
        System.out.println("Завершение вывода");
    }
}
