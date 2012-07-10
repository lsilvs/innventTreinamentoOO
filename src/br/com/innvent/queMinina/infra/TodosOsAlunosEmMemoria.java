package br.com.innvent.queMinina.infra;

import java.util.ArrayList;
import java.util.List;

import br.com.innvent.queMinina.treinamento.Aluno;
import br.com.innvent.queMinina.treinamento.TodosOsAlunos;

public class TodosOsAlunosEmMemoria implements TodosOsAlunos {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	

	@Override
	public Aluno getObterAlunoPorNome(String nome) {
		for(Aluno aluno : this.alunos){
			if (aluno.getNome().equals(nome)){
				return aluno;
			}
		}
		return null;
	}

	@Override
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

}
