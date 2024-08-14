package com.service;
import java.util.ArrayList;
import java.util.List;
 
import com.model.Book;
 
public class BookStore {
    private List<Book> books;
 
    public BookStore() {
        this.books = new ArrayList<>();
    }
 
    public void addBook(Book b) {
        books.add(b);
    }
 
    
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }
 
    
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
 
  
    public void displayAll() {
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBook_id());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Category: " + book.getCat());
            System.out.println("Price: " + book.getPrice());
            System.out.println();
        }
    }
}