package Final;

import java.io.Serializable;

public class Book implements Serializable {
	private String isbn;
	private String title;
	private String author;
	private int price;
	private int year;
	private String pub;
	private int pop;
	public Book(String isbn, String title, String author, int price,int year,String pub,int pop){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.year = year;
		this.pub = pub;
		this.pop = pop;
	}

	public int getYear() {
		return year;
	}
	
	public String getPub() {
		return pub;
	}
	
	public int getPop() {
		return pop;
	}
	
	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}
	
	public void setPop(int pop) {
		this.pop = pop;
	}
	
	public void setPub(String pub) {
		this.pub = pub;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
		return "[ISBN]" + getIsbn() + " [제목]" + getTitle() + " [저자]" + getAuthor() + " [가격]" + getPrice() + " [출판년도]" + getYear() + " [출판사]" + getPub() + " [인기도]" + getPop();
	}

}

