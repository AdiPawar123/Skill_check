package com.model;

public class Book {
	
	private String book_id;
	private String title;
	private String author;
	private String price;
	private String cat;
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Book(String book_id, String title, String author, String price,
			float price2) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.cat = cat;
	}

	
	

}
