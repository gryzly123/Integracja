/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.kniedzwiecki.integracja.books;

/**
 *
 * @author knied
 */
public class Book {

	private String id;
	private String title;
	private String author;
	private String isbn;
	private Integer year;
	
	public Book()
	{
		
	}
	
	public Book(String _id, String _title, String _author, String _isbn, Integer _year)
	{
		id = _id;
		title = _title;
		author = _author;
		isbn = _isbn;
		year = _year;
	}

	@Override
	public String toString()
	{
		return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", year=" + year + '}';
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
}
