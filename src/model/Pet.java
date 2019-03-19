package model;

public class Pet{
	
	public static final char CAT = 'C';
	public static final char DOG = 'D';
	public static final char BIRD = 'B';
	public static final char OTHERS = 'O';
	
	private String name;
	private char typeOfPet;
	private int age;
	private double weight;
	
	private Client owner;
	
public Pet (String nami, char typeOfPet, int age, double weight, Client owner){
	
	name = nami;
	this.typeOfPet = typeOfPet;
	this.age = age;
	this.weight = weight;
	this.owner = owner;
	
}
	
	public String getName(){
		return name;
	}
	private void setName(String name){
		this.name = name;
	}
	
	public char getTypeOfPet(){
		return typeOfPet;
	}
	private void setTypeOfPet(char typeOfPet){
		this.typeOfPet = typeOfPet;
	}
	
	public int getAge(){
		return age;
	}
	private void setAge(int age){
		this.age = age;
	}
	
	public double getWeight(){
		return weight;
	}
	private void setWeight(double weight){
		this.weight = weight;
	}
	
	public Client getOwner(){
		return owner;
	}
	private void setOwner(Client owner){
		this.owner = owner;
	}
	
	
}