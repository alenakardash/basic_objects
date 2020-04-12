package com.company.training.book.bean;

/* Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти 
данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

public class Book {
	
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int publishYear;
	private int pageNumber;
	private int price;
	private String bindingType;
	
	public Book(int id, String name, String author, String publisher, int publishYear) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
	}
	
	public Book() {
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPublishYear() {
		return publishYear;
	}
	
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBindingType() {
		return bindingType;
	}
	
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	
	 public String toString() {
		 return "Book info: id = " + id + ", name = " + name + ", author = " + author + ", price = " + price + ", publisher = " + publisher + " publishYear = " + publishYear;
		 
	 }
}
