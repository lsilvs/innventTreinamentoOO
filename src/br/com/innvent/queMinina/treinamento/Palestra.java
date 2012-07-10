package br.com.innvent.queMinina.treinamento;
import br.com.innvent.queMinina.instrutores.Instrutor;


public class Palestra extends Treinamento {

	private double ajudaDeCusto;
    /// isto Ž uma palestra
	public Palestra(String nome, Instrutor instrutor, double ajudaDeCusto){
		this.setNome(nome);
		this.definirInstrutor(instrutor);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double getPreco(){
		return this.ajudaDeCusto;
	}
}
