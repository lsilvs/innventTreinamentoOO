package br.com.innvent.queMinina.treinamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Turma {

	
	private Treinamento treinamento;
	private Periodo periodo;
	private int quantidadeMaximaDeAlunos;
	private List<Matricula> matriculas;
	private String nome;

	public Turma(Treinamento treinamento, Calendar dataInicio, Calendar dataFim){
		this.treinamento = treinamento;
		this.periodo  = new Periodo(dataInicio, dataFim);
		this.matriculas = new ArrayList<Matricula>();
	}

	public boolean estahSobreposto(Turma outraTurma) {
		return this.periodo.estahSobreposto(outraTurma.getPeriodo());
	}

	public void definirQuantidadeMaximaDeAlunos(int quantidade) {
		this.quantidadeMaximaDeAlunos = quantidade;
	}

	public int getQuantidadeMaximaDeAlunos() {
		return this.quantidadeMaximaDeAlunos;
	}

	public Matricula matricular(Aluno aluno) {
		if (this.haVagas()){
			return criarMatricula(aluno);
		} else {
			throw new IllegalStateException("Quantidade maxima alcançada da turma");
		}
	}

	private Matricula criarMatricula(Aluno aluno) {
		double valor = treinamento.getPreco();
		Matricula matricula = new Matricula(aluno,this,valor);
		this.matriculas.add(matricula);
		aluno.adicionarTurma(this);
		return matricula;
	}
	
	

	private boolean haVagas() {
		return (this.quantidadeDeMatriculas() < this.quantidadeMaximaDeAlunos ) || (this.quantidadeMaximaDeAlunos == 0);
	}

	public int quantidadeDeMatriculas() {
		return this.matriculas.size();
	}
	
	public Periodo getPeriodo(){
		return this.periodo;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
}
