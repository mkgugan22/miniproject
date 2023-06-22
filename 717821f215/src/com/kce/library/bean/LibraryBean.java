package com.kce.library.bean;

public class LibraryBean implements Comparable{
 public String BookName;
 public int BookId;
 public String BookAuthor;
 public String BookGenre;
 public int costOfBook;
public LibraryBean(String BookName, int BookId, String BookAuthor, String BookGenre, int costOfBook) {
	super();
	this.BookName = BookName;
	this.BookId = BookId;
	this.BookAuthor = BookAuthor;
	this.BookGenre = BookGenre;
	this.costOfBook = costOfBook;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String BookName) {
	this.BookName = BookName;
}
public int getBookId() {
	return BookId;
}
public void setBookId(int BookId) {
	this.BookId = BookId;
}
public String getBookAuthor() {
	return BookAuthor;
}
public void setBookAuthor(String BookAuthor) {
	this.BookAuthor = BookAuthor;
}
public String getBookGenre() {
	return BookGenre;
}
public void setBookGenre(String BookGenre) {
	this.BookGenre = BookGenre;
}
public int getCostOfBook() {
	return costOfBook;
}
public void setCostOfBook(int costOfBook) {
	this.costOfBook = costOfBook;
}
@Override
public String toString() {
	return "LibraryBean [BookName=" + BookName + ", BookId=" + BookId + ", BookAuthor=" + BookAuthor + ", BookGenre="
			+ BookGenre + ", costOfBook=" + costOfBook + "]";
}
@Override
public int compareTo(Object o) {
	LibraryBean b=(LibraryBean)o;
	return this.BookName.compareTo(b.getBookName());
}
 
}
