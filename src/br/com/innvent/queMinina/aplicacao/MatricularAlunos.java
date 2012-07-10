package br.com.innvent.queMinina.aplicacao;

import br.com.innvent.queMinina.infra.TodasAsTurmaEmMemoria;
import br.com.innvent.queMinina.infra.TodosOsAlunosEmMemoria;
import br.com.innvent.queMinina.treinamento.Aluno;
import br.com.innvent.queMinina.treinamento.Matricula;
import br.com.innvent.queMinina.treinamento.TodasAsTurmas;
import br.com.innvent.queMinina.treinamento.TodosOsAlunos;
import br.com.innvent.queMinina.treinamento.Turma;

public class MatricularAlunos {

	private String nomeDoAluno;
	private String nomeDaTurma;
	private TodasAsTurmas todasAsTurmas;
	private TodosOsAlunos todosOsAlunos;

	public MatricularAlunos(String nomeDoAluno, String nomeDaTurma, TodasAsTurmas turmas, TodosOsAlunos alunos){
		this.nomeDoAluno = nomeDoAluno;
		this.nomeDaTurma = nomeDaTurma;
		this.todasAsTurmas = turmas;
		this.todosOsAlunos = alunos;
	}
	
	public Matricula execute(){
		Turma turma = this.todasAsTurmas.getTurmaPorNome(this.nomeDaTurma);
		Aluno aluno = this.todosOsAlunos.getObterAlunoPorNome(this.nomeDoAluno);
		return  turma.matricular(aluno);
	}
}
