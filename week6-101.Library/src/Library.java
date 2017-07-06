/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euanwilliams
 */
import java.util.*;

public class Library {

    private ArrayList<Book> books = new ArrayList();

    public Library() {
    }

    public void addBook(Book newBook) {
        books.add(newBook);

    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchResults = new ArrayList();
        for (Book book : books) {
            if (StringUtils.included(book.title(), title)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searchResults = new ArrayList();
        for (Book book : books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searchResults = new ArrayList();
        for (Book book : books) {
            if (book.year() == (year)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

}
