package br.com.innvent.queMinina.treinamento;

import java.util.ArrayList;
import java.util.List;

import br.com.innvent.queMinina.instrutores.Instrutor;

public abstract class Treinamento {
	//Wrappers Integer x = new Integer(10);
	// boxing
	private String nome;
	private int cargaHoraria;
	private double preco;
	private List<String> preRequisitos;
	private TipoDeTreinamento tipo;
	private Instrutor instrutor;
	
	private boolean disponivelParaVenda;

	public Treinamento(){
		this.preRequisitos = new ArrayList<String>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public abstract double getPreco();
	

	public List<String> getPreRequisitos() {
		return  new ArrayList<String>(this.preRequisitos);
	}

	public void disponibilizarParaVenda() {
		this.disponivelParaVenda = true;
	}

	public boolean estahDisponivelParaVenda() {
		return this.disponivelParaVenda;
	}

	public void indisponibilizarParaVenda() {
		this.disponivelParaVenda = false;
	}

	public void adicionarPreRequisito(String preRequisito) {
		this.preRequisitos.add(preRequisito);
	}
	
	public void definirTipo(TipoDeTreinamento tipo){
		this.tipo = tipo;
	}

	public TipoDeTreinamento getTipoTreinamento(){
		return this.tipo;
	}
	
	public void definirInstrutor(Instrutor instrutor){
		this.instrutor = instrutor;
	}
	
	public Instrutor getInstrutor(){
		return this.instrutor;
	}
	
	public void mostrar(){
		for(String preRequisito : this.preRequisitos){
			System.out.println(preRequisito);
		}
	}
	
	
}
