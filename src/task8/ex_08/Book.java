package task8.ex_08;

public class Book implements Cloneable {

    private Author author;
    private String title;

    Book(String title, Author author) {
        this.author = author;
        this.title = title;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getAuthor() {
        return author.name;
    }
}
