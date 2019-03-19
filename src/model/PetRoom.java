package model;

public class PetRoom{
	
	private boolean avaible;
	private String name;
	
	private HistoryClinic history;
	
public PetRoom (boolean avaible, String namo, HistoryClinic history){
	
	this.avaible = avaible;
	name = namo;
	this.history = history;
}

	public boolean getAvaible(){
		return avaible;
	}
	private void setAvaible(boolean avaible){
		this.avaible = avaible;
	}
	
	public String getName(){
		return name;
	}
	private void setName(String name){
		this.name = name;
	}
	
	public HistoryClinic getHistory(){
		return history;
	}
	private void setHistory(HistoryClinic history){
		this.history = history;
	}

	
	
	
	
	
}