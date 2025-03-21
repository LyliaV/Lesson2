package task1.ex_02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_02 {
    /**
     * вычислять площадь круга по заданному радиусу. Формула для вычисления:
     * S=π×r^2
     * Где: r — радиус круга (тип double),
     * π — константа (используйте Math.PI).
     * Пример ввода:
     * Введите радиус круга: 5
     * Пример вывода:
     * Площадь круга: 78.53981633974483
     */

    public static void main(String[] args) {
        new Ex_02().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");

        double radius = 0.0;

        try {
            radius = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("Введите число!");
            return;
        };

        double squareСircle = Math.PI * Math.pow( radius, 21 );

        System.out.print("Площадь круга: " + squareСircle);

    }


}
