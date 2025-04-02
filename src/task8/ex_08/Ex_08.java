package task8.ex_08;


/**
 * Clonable.
 * Реализуйте класс Author с одним полем String name.
 * Реализуйте класс Book с полем Author author и полем String title
 * Реализуйте глубокое клонирование объекта Book с помощью метода clone.
 */

public class Ex_08 {

    public static void main(String[] args) {
        new Ex_08().run();
    }

    public void run() {

        Book book1 = new Book("book1", new Author("Author 1"));
        Book book2;
        try {
            book2 = (Book) book1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Получилось: " + (book1.getAuthor() != book2.getAuthor()));

    }
}
