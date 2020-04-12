package com.company.training.book.view;

import java.util.ArrayList;

import com.company.training.book.bean.Book;

public class BookView {
	
	public void printBook(ArrayList<Book> books) {
		for(Book book : books) {
			System.out.println(book.toString());
		}
	}

}
