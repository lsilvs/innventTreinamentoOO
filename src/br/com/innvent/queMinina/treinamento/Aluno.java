package br.com.innvent.queMinina.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private String cpf;
	
	private List<Turma> turmas;

	public Aluno(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
		this.turmas = new ArrayList<Turma>();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean jaParticipouDeTreinamento(){
		return this.turmas.size() > 0;
	}

	public void adicionarTurma(Turma turma) {
		this.turmas.add(turma);
		
	}
}
