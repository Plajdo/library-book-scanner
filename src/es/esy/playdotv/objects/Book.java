package es.esy.playdotv.objects;

import java.util.Date;

public class Book implements Paper{
	
	private static final long serialVersionUID = 1L;
	private String ID;
	private String title;
	private String author;
	private boolean borrowed;
	private Date borrowedDate;
	private Date borrowedUntilDate;
	
	public Book(String id) {
		this.borrowedDate = new Date();
		this.borrowedUntilDate = new Date();
		this.ID = id;
		this.borrowed = false;
	}
	
	public Book(String id, String author, String title) {
		this.borrowedDate = new Date();
		this.borrowedUntilDate = new Date();
		this.ID = id;
		this.author = author;
		this.title = title;
		this.borrowed = false;
	}

	@Override
	public String getID(){
		return ID;
	}

	@Override
	public String getTitle(){
		return title;
	}

	@Override
	public String getAuthor(){
		return author;
	}

	@Override
	public boolean isBorrowed(){
		return borrowed;
	}

	@Override
	public void setTitle(String title){
		this.title = title;
	}

	@Override
	public void setAuthor(String author){
		this.author = author;
	}

	@Override
	public void setBorrowed(boolean borrowed){
		this.borrowed = borrowed;
	}

	
	@Override
	public void setBorrowDate(Date date, Date dateUntil){
		borrowedDate = date;
		borrowedUntilDate = dateUntil;
	}
	

	@Override
	public Date getBorrowedUntilDate(){
		return borrowedUntilDate;
	}
	
	@Override
	public Date getBorrowedDate() {
		return borrowedDate;
	}

}
