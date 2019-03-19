package model;

public class HistoryClinic {
	
	private boolean status;
	private String diagnostic;
	private String symptoms;
	private double costForDay;
	
	private Pet petClinic;
	private Medicine datesMedicine;
	private Date date;
	

public HistoryClinic (boolean status, String diagnostic, String symptoms, double costForDay, Pet petClinic, Medicine datesMedicine, Date date){
	
	this.status = status;
	this.diagnostic = diagnostic;
	this.symptoms = symptoms;
	this.costForDay = costForDay;
	this.petClinic = petClinic;
	this.datesMedicine = datesMedicine;
	this.date = date;
	
}



}