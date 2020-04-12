package com.company.training.object;

import java.util.ArrayList;

import com.company.training.book.bean.Book;
import com.company.training.book.logic.BookLogic;
import com.company.training.book.view.BookView;

public class BookDemo {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();

		Book book1 = new Book(1, "Сказки", "автор1", "издат2", 1987);
		Book book2 = new Book(2, "Роман", "автор2", "издат1", 1991);
		Book book3 = new Book(3, "Басни", "автор1", "издат2", 1995);
		Book book4 = new Book(4, "Приключения", "автор2", "издат1", 2020);
		Book book5 = new Book(5, "Фантастика", "автор1", "издат2", 2007);
		Book book6 = new Book(6, "Стихи", "автор3", "издат1", 1989);
		Book book7 = new Book(7, "Поэма", "автор4", "издат2", 2011);

		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);

		BookLogic logic = new BookLogic();

		ArrayList<Book> sameAuthorBooks = new ArrayList<Book>();

		sameAuthorBooks = logic.findBooksByAuthor(books, "автор1");

		BookView view = new BookView();

		view.printBook(sameAuthorBooks);

		ArrayList<Book> samePublisherBooks = new ArrayList<Book>();

		samePublisherBooks = logic.findBooksByPublisher(books, "издат2");

		System.out.println("");

		view.printBook(samePublisherBooks);

		ArrayList<Book> publishedLaterBooks = new ArrayList<Book>();

		publishedLaterBooks = logic.findPublishedLater(books, 1991);

		System.out.println("");

		view.printBook(publishedLaterBooks);
	}

}
