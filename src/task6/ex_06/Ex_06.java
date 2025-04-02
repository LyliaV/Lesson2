package task6.ex_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_06 {

    /**
     * Реализовать класс-счетчик.
     * Полями класса должны выступать название счетчика и, непосредственно, целочисленный счетчик.
     * <p>
     * Реализовать для созданного класса конструктор с двумя параметрами,
     * с одним (значение счетчика в таком случае инициализировать как 0),
     * методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целом значение.
     * Методы должны возвращать актуальное значение счетчика.
     * <p>
     * Используя созданный класс,
     * посчитать количество четных и количество нечетных чисел в ряду от 1 до 100.
     * Конечные показатели счетчиков вывести в консоль.
     */

    public static void main(String[] args) {
        new Ex_06().run();
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        int userCounter = 0;

        System.out.print("На сколько увеличить счетчик?: ");

        try {
            userCounter = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Ожидалось целое число");
            return;
        }
        ;

        Counter evenCounter = new Counter("Количество четных чисел", 0);
        Counter oddCounter = new Counter("Количество нечетных чисел", 0);

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                evenCounter.plusCounter(userCounter);
            } else {
                oddCounter.plusCounter(userCounter);
            }
        }

        System.out.print(evenCounter.counterName + ": " + evenCounter.counter);
        System.out.print("\n" + oddCounter.counterName + ": " + oddCounter.counter);

    }

}
