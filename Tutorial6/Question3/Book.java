package Tutorial6.Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Book implements Comparable<Book>{
    @Override
    public int compareTo(Book o) {
        if (this.year > o.year)
        {
            return 1;
        }else if (this.year<o.year)
        {
            return -1;
        }
        return 0;
    }

    private String title;
    private double price;
    private int year;
    private String author;

    public Book(int year, String author, String title) {
        this.year = year;
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Author: "+this.author+"\n Year: "+this.year+"\n Title: "+this.title;
    }

    public static void main(String[] args) {
        System.out.println("""
                Press 'A' to add Book
                """);
        ArrayList<Book> bookArrayList = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("a")) {
            Book book1 = new Book(2015, "Uzman", "Dead Man");
            Book book2 = new Book(2017, "Abubakr", "Dead Man");
            bookArrayList.add(book1);
            System.out.println(book2);
        }

            Collections.sort(bookArrayList);
        for (Book book: bookArrayList) {
            System.out.println(book);
        }

    }
}
