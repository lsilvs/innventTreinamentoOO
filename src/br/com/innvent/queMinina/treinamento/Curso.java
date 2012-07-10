package br.com.innvent.queMinina.treinamento;

import br.com.innvent.queMinina.instrutores.Instrutor;

public class Curso extends Treinamento {

	
	public Curso(String nome,int cargaHoraria, Instrutor instrutor){
		this.setNome(nome);
		this.definirInstrutor(instrutor);
		this.setCargaHoraria(cargaHoraria);
	}
	
	public double getPreco(){
		return this.getInstrutor().getValorHora() * this.getCargaHoraria() * 1.1;
	}
}
