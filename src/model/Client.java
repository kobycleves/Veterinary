package model;

public class Client{
	
//Atributes

	private String name;
	private int id;
	private String address;
	private int telephoneContact;
	
//Relations

	private Pet pets;

public Client (String nam, int id, String addr, int teleContact, Pet pets){
	
	name = nam;
	this.id = id;
	address = addr;
	telephoneContact = teleContact;
	this.pets = pets;
	
}

	public String getName(){
		return name;
	}
	private void setName(String name){
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	private void setId(int id){
		this.id = id;
	}
		
	public String getAddress(){
		return address;
	}
	private void setAddress(String address){
		this.address = address;
	}
		
	public int getTelephoneContact(){
		return telephoneContact;
	}
	private void setTelephoneContact(int telephoneContact){
		this.telephoneContact = telephoneContact;
	}
	
	public Pet getPets(){
		return pets;
	}
	private void setPets(Pet pets){
		this.pets = pets;
	}
		


}
