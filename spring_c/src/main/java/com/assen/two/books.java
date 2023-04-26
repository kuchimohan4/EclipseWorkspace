package com.assen.two;

public class books {
	private int bookCode;
	private String bookTitle;
	private String bookAuthor;
	private double bookPrice;
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public books(int bookCode, String bookTitle, String bookAuthor, double bookPrice) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	public books() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "books [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookPrice=" + bookPrice + "]";
	}
	

}
