package model;

 public class Date{

	 //Attributes

    private int day;
	private int month;
	private int year;
	
	//builder
	
	public Date(int theDay, int theMonth, int theYear){
		day = theDay;
		month = theMonth;
		year = theYear;
	}
	

	//initializer
	
	public void unit(int theDay, int theMonth, int theYear){
		day = theDay;
		month = theMonth;
		year = theYear;
	}
	//metod
	
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		this.day = day;
	}
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	
 }	