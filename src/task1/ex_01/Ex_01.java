package task1.ex_01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        new Ex_01().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия1: ");

        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Температура в градусах Фаренгейта: " + fahrenheit);
    }
}

