package model;

public class Medicine{
	
	private String name;
	private double dose;
	private double costForDose;
	private double frequencyDose;
	
public Medicine (String namu, double dose, double costForDose, double frequencyDose){

	name = namu;
	this.dose = dose;
	this.costForDose = costForDose;
	this.frequencyDose = frequencyDose;
	
}
	public String getName(){
		return name;
	}
	private void setName(String name){
		this.name = name;
	}
	
	public double getDose(){
		return dose;
	}
	private void setDose(double dose){
		this.dose = dose;
	}
	
	public double getCostForDose(){
		return costForDose;
	}
	private void setCostForDose(double costForDose){
		this.costForDose = costForDose;
	}
	
	public double getFrequencyDose(){
		return frequencyDose;
	}
	private void setFrequencyDose(double frequencyDose){
		this.frequencyDose = frequencyDose;
	}

	
}

	