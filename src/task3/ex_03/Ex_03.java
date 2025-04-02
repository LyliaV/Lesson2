package task3.ex_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_03 {

    /**
     * написать программу, которая принимает трехзначное число (тип int) и вычисляет сумму его цифр.
     * + то же самое любым циклом
     * Пример ввода:
     * Введите трехзначное число: 123
     * Пример вывода:
     * Сумма цифр: 6
     */

    public static void main(String[] args) {
        new Ex_03().run();
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число: ");

        int threeNumber = 0;

        try {
            threeNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Введите трехзначное число!");
            return;
        }
        ;

        if (threeNumber < 0) {
            System.out.print("Число должно быть положительным!");
            return;
        }

        if (String.valueOf(threeNumber).length() != 3) {
            System.out.print("Введите трехзначное число!");
            return;
        }

        int summ = 0;

        while (threeNumber > 0) {
            summ = summ + threeNumber % 10;
            threeNumber = threeNumber / 10;
        }

        System.out.print("Сумма цифр: " + summ);
    }
}
