package br.com.innvent.queMinina.treinamento.util;

import java.util.Calendar;

import br.com.innvent.queMinina.aplicacao.MatricularAlunos;
import br.com.innvent.queMinina.infra.TodasAsTurmaEmMemoria;
import br.com.innvent.queMinina.infra.TodosOsAlunosEmMemoria;
import br.com.innvent.queMinina.instrutores.Instrutor;
import br.com.innvent.queMinina.treinamento.Aluno;
import br.com.innvent.queMinina.treinamento.Matricula;
import br.com.innvent.queMinina.treinamento.TodasAsTurmas;
import br.com.innvent.queMinina.treinamento.TodosOsAlunos;
import br.com.innvent.queMinina.treinamento.Treinamento;
import br.com.innvent.queMinina.treinamento.Turma;
import br.com.innvent.queMinina.treinamento.Workshop;

public class TestaTreinamento {

	private static TodosOsAlunosEmMemoria todosOsAlunos;
	private static TodasAsTurmaEmMemoria todasAsTurmas;

	public static void main(String[] args) {
		preparCenario();
		
		MatricularAlunos matricularAluno = new MatricularAlunos("Rosinha", "Curso de Java", todasAsTurmas, todosOsAlunos);
		Matricula matricula = matricularAluno.execute();
		System.out.println(matricula.getAluno().getNome());
		
		
		
	}
	
	private static void preparCenario(){
		Treinamento treinamento = new Workshop("Work de qualquer coisa", new Instrutor("jose", 29) );
		treinamento.setNome("Workshop de OO");
		treinamento.setCargaHoraria(8);
		
		treinamento.disponibilizarParaVenda();
		
		treinamento.adicionarPreRequisito("Conhecimentos de Java");
		treinamento.mostrar();
		
		Aluno aluno = new Aluno("Rosinha", "183892");
		Turma turma = new Turma(treinamento,Calendar.getInstance(), Calendar.getInstance());
		turma.setNome("Curso de Java");
		
		todasAsTurmas = new TodasAsTurmaEmMemoria();
		todasAsTurmas.adicionarTurma(turma);
		
		todosOsAlunos = new TodosOsAlunosEmMemoria();
		todosOsAlunos.adicionarAluno(aluno);
	}

}

