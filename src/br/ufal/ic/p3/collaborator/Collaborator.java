package br.ufal.ic.p3.collaborator;

public abstract class Collaborator {
	
	protected String name;
	protected String email;
	protected int id;
	//protected String record;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	
	
	

}
