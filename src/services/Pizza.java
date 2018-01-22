package services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.Ingrediente;

public class Pizza {

	private final BigDecimal CUSTO_MENOR_QUE_3_INGREDIENTES = new BigDecimal(15);

	private final BigDecimal CUSTO_3_A_5_INGREDIENTES = new BigDecimal(20);

	private final BigDecimal CUSTO_MAIOR_QUE_5_INGREDIENTES = new BigDecimal(23);

	public List<Ingrediente> ingredientes = new ArrayList<>();
	
	public BigDecimal gastoPorPizza = BigDecimal.ZERO;	
	
	public void adicionaIngrediente(Ingrediente ingrediente) {
		ingredientes.add(ingrediente);
	}
	
	public void contabilizaGasto() {
		gastoPorPizza = getPreco();		
	}
	
	public BigDecimal getPreco() {
		BigDecimal retorno = BigDecimal.ZERO;

		if (ingredientes.size() <= 2) {
			retorno = CUSTO_MENOR_QUE_3_INGREDIENTES;
		} else if (ingredientes.size() > 2 && ingredientes.size() <= 5) {
			retorno = CUSTO_3_A_5_INGREDIENTES;
		} else if (ingredientes.size() > 5) {
			retorno = CUSTO_MAIOR_QUE_5_INGREDIENTES;
		}
		return retorno;
	}	
}
