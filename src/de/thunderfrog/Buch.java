package de.thunderfrog;

public class Buch {
    private String title;
    private String author;
    private String isbn;
    private int bookNum;
    private static int bookNumCount = 0;

    public Buch(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        bookNumCount++;
        this.bookNum = bookNumCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", bookNum=" + getBookNum() +
                '}';
    }
}
