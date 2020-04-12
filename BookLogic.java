package com.company.training.book.logic;

import java.util.ArrayList;

import com.company.training.book.bean.Book;

public class BookLogic {
	
	public ArrayList<Book> findBooksByAuthor(ArrayList<Book> books, String author) {
		ArrayList<Book> sameAuthorBooks = new ArrayList<Book>(books.size());
		
		int count  = 0;
		
		for(Book book : books) {
			if(book.getAuthor().contentEquals(author)) {
				sameAuthorBooks.add(book);
				count++;
			}
		}
		
		if(count == 0)  {
			System.out.println("Книги такого автора не найдены");
		}
		
		return sameAuthorBooks;
	}
	
	public ArrayList<Book> findBooksByPublisher(ArrayList<Book> books, String publisher) {
		ArrayList<Book> samePublisherBooks = new ArrayList<Book>();
		
		int count  = 0;
		
		for(Book book : books) {
			if(book.getPublisher().contentEquals(publisher)) {
				samePublisherBooks.add(book);
				count++;
			}
		}
		
		if(count == 0)  {
			System.out.println("Книги такого издательства не найдены");
		}
		
		return samePublisherBooks;
	}
	
	public ArrayList<Book> findPublishedLater(ArrayList<Book> books, int year) {
		ArrayList<Book> publishedLaterBooks = new ArrayList<Book>();
		
		for(Book book : books) {
			if(book.getPublishYear() > year) {
			publishedLaterBooks.add(book);}
		}
		return publishedLaterBooks;
	}

}
