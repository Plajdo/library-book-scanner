package es.esy.playdotv.objects;

import java.util.Date;
import java.util.GregorianCalendar;

public class Book implements Paper{
	
	private static final long serialVersionUID = 1L;
	private String ID;
	private String title;
	private String author;
	private boolean borrowed;
	private Date borrowedDate;
	private Date borrowedUntilDate;
	
	public Book(String strid) {
		borrowedDate = new Date();
		borrowedUntilDate = new Date();
		ID = strid;
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
	public void setBorrowDate(int day, int month, int year, int untilDay, int untilMonth, int untilYear){
		borrowedDate.setTime(new GregorianCalendar(year, month, day).getTimeInMillis());
		borrowedUntilDate.setTime(new GregorianCalendar(untilYear, untilMonth, untilDay).getTimeInMillis());
	}

	@Override
	public Date borrowedUntil(){
		return borrowedUntilDate;
	}

}
