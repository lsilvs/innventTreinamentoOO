package br.com.innvent.queMinina.treinamento;
import br.com.innvent.queMinina.instrutores.Instrutor;


public class Workshop extends Treinamento {

	public Workshop(String nome, Instrutor instrutor){
		this.setNome(nome);
		this.definirInstrutor(instrutor);
	}
	
	public double getPreco(){
		return 500 * 1.1;
	}
}
