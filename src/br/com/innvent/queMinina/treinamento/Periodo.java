package br.com.innvent.queMinina.treinamento;

import java.security.InvalidParameterException;
import java.util.Calendar;

public class Periodo {

	private Calendar dataInicio;
	private Calendar dataFim;
	
	public Periodo(Calendar dataInicio, Calendar dataFim){
		if (dataInicio.after(dataFim)){
			throw new InvalidParameterException("Data Inicial n‹o pode ser maior que data Final");
		}
		this.dataInicio = dataInicio;
		this.dataFim    = dataFim;
	}

	public boolean estahSobreposto(Periodo periodo) {
		return ! (this.dataInicio.after(periodo.dataFim) || this.dataFim.before(periodo.dataInicio) &&
				periodo.dataInicio.after(this.dataFim) || periodo.dataFim.before(this.dataInicio));
		
	}
	
}
