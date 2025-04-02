package task5.ex_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_05 {

    /**
     * Выводить на экран "Не угадал!" до тех пор,
     * пока с клавиатуры не будет введено число 1.
     * Запрашивать число с клавиатуры перед выводом на экран "Не угадал!"
     * типы циклов: while{..}, do{..} while(), for(){..}
     */

    public static void main(String[] args) {
        new Ex_05().run();
    }

    public void run() {

        boolean flagExit = false;

        while (flagExit != true) {

            Scanner scanner = new Scanner(System.in);

            int numСomparison = 0;

            System.out.print("\nВведите число: ");

            try {
                numСomparison = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Не угадал!");
                continue;
            }
            ;
            if (numСomparison == 1) {
                System.out.print("Угадал!");
                flagExit = true;
            } else {
                System.out.print("Не угадал!");
            }
        }
    }
}
