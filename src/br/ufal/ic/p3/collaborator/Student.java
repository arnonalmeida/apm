package br.ufal.ic.p3.collaborator;

public abstract class Student extends Collaborator {
	
	private int idAdvisor;
	private String dataIngresso;
	
	public int getIdAdvisor() {
		return idAdvisor;
	}
	
	public void setIdAdvisor(int idAdvisor) {
		this.idAdvisor = idAdvisor;
	}
	
	public String getDataIngresso() {
		return dataIngresso;
	}
	
	public void setdataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
}
