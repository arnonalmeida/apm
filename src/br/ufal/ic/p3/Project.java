package br.ufal.ic.p3;

import java.util.ArrayList;
import java.util.List;

public class Project {
	
	private String titulo, dataInicio, dataTermino, agFinanciadora, objetivo, descricao;
	private double valorFinanciado;
	private int id;
	static private Status status;
	private List<Integer> participantes = new ArrayList<Integer>();

	public Project(int id, String titulo, String dataInicio, String dataTermino, String agFinanciadora, double valorFinanciado, String objetivo, String descricao){
		this.id = id;
		this.titulo = titulo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.agFinanciadora = agFinanciadora;
		this.valorFinanciado = valorFinanciado;
		this.objetivo = objetivo;
		this.descricao = descricao;
		status = status.EM_ELABORACAO;
	}
	
	public void addParticipantes(int participante)
	{
		participantes.add(participante);
	}
	

}
