package br.com.innvent.queMinina.treinamento;

import java.util.Calendar;

public class Matricula {

	private int numero;
	private Aluno aluno;
	private Turma turma;
	
	private Calendar data;
	private double valor;

	public Matricula(Aluno aluno, Turma turma, double valor){
		this.aluno = aluno;
		this.turma  = turma;
		this.data = Calendar.getInstance();
		atualizarValor(aluno, valor);
	}

	private void atualizarValor(Aluno aluno, double valor) {
		if (aluno.jaParticipouDeTreinamento()){
			this.valor = valor * 0.9;
		} else {
			this.valor = valor;
		}
	}
	
	public Aluno getAluno(){
		return this.aluno;
	}
	
	public Turma getTurma(){
		return this.turma;
	}
	
	public Calendar getData(){
		return (Calendar) this.data.clone();
	}
	
	public double valor(){
		return this.valor;
	}
	
	
	
}
