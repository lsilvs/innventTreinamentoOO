package br.com.innvent.queMinina.infra;

import java.util.ArrayList;
import java.util.List;

import br.com.innvent.queMinina.treinamento.TodasAsTurmas;
import br.com.innvent.queMinina.treinamento.Turma;

public class TodasAsTurmaEmMemoria implements TodasAsTurmas {

	private List<Turma> turmas = new ArrayList<Turma>();
	
	@Override
	public Turma getTurmaPorNome(String nome) {
		for(Turma turma : this.turmas){
			if (turma.getNome().equals(nome)){
				return turma;
			}
		}
		return null;
	}
	
	public void adicionarTurma(Turma turma){
		this.turmas.add(turma);
	}

}
