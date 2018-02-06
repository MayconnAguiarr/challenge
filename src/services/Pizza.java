package services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.CustoProduto;
import model.Ingrediente;

public class Pizza {

	public List<Ingrediente> ingredientes = new ArrayList<>();

	public void adicionaIngrediente(Ingrediente ingrediente) {
		ingredientes.add(ingrediente);
	}

	public BigDecimal getPreco() {
		BigDecimal retorno = BigDecimal.ZERO;

		if (ingredientes.size() <= 2) {
			retorno = CustoProduto.CUSTO_MENOR_QUE_3_INGREDIENTES.getValor();
		} else if (ingredientes.size() > 2 && ingredientes.size() <= 5) {
			retorno = CustoProduto.CUSTO_3_A_5_INGREDIENTES.getValor();
		} else if (ingredientes.size() > 5) {
			retorno = CustoProduto.CUSTO_MAIOR_QUE_5_INGREDIENTES.getValor();
		}
		return retorno;
	}
}
