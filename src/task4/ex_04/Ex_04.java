package task4.ex_04;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex_04 {

    /**
     * написать программу, которая принимает количество секунд (тип int) и выводит его в формате "часы:минуты:секунды".
     * Пример ввода:
     * Введите количество секунд: 3661
     * Пример вывода:
     * 1 час : 1 минута : 1 секунда
     */


    public static void main(String[] args) {
        new Ex_04().run();
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество секунд: ");

        int seconds = 0;

        try {
            seconds = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Введите число секунд!");
            return;
        }
        ;

        if (seconds < 0) {
            System.out.print("Число должно быть положительным!");
            return;
        }

        int hours  = seconds / 3600;
        int minute = ( seconds % 3600) / 60;
        int second = seconds % 60 ;

        System.out.print( hours + " час : " + minute + " минута : " + second + " секунда");

    }
}
