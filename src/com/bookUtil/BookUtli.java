package com.bookUtil;

import java.util.Scanner;

import com.exception.BookException;
import com.model.Book;
import com.service.BookStore;
 
public class BookUtli {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        BookStore bookstore = new BookStore();
 
	        for (int i = 0; i < 3; i++) {
	        	try {
	                System.out.println("Enter details for book " + (i + 1) + ":");
	                System.out.print("Book ID: ");
	                String book_id = scanner.nextLine();
	                validateBookId(book_id);
 
	                System.out.print("Title: ");
	                String title = scanner.nextLine();
 
	                System.out.print("Author: ");
	                String author = scanner.nextLine();
 
	                System.out.print("Category (science, fiction, technology, others): ");
	                String category = scanner.nextLine();
	                validateCategory(category);
 
	                System.out.print("Price: ");
	                float price = scanner.nextFloat();
	                validatePrice(price);
	                scanner.nextLine();
 
	                Book book = new Book(book_id, title, author, category, price);
	                bookstore.addBook(book);
	            } catch (BookException e) {
	                System.out.println("Error: " + e.getMessage());
	                i--;
	            }
	
 
	        }
 
	        System.out.println("All books in the bookstore:");
	        bookstore.displayAll();
 
	    }
	 public static void validateBookId(String book_id) throws BookException {
	        if (book_id.length() != 4 || !book_id.startsWith("B")) {
	            throw new BookException("Book ID must start with 'B' and be 4 characters long.");
	        }
	    }
 
	    private static void validateCategory(String category) throws BookException {
	        if (!category.equalsIgnoreCase("science") && !category.equalsIgnoreCase("fiction") &&
	            !category.equalsIgnoreCase("technology") && !category.equalsIgnoreCase("others")) {
	            throw new BookException("Category must be one of the following: science, fiction, technology, others.");
	        }
	    }
 
	    private static void validatePrice(float price) throws BookException {
	        if (price < 0) {
	            throw new BookException("Price cannot be negative.");
	        }
	    }
	
	}