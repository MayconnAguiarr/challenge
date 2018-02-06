package model;

import java.math.BigDecimal;

public enum CustoProduto {
	
	CUSTO_MENOR_QUE_3_INGREDIENTES(new BigDecimal(15)),
	CUSTO_3_A_5_INGREDIENTES(new BigDecimal(20)),
	CUSTO_MAIOR_QUE_5_INGREDIENTES (new BigDecimal(23));

	private BigDecimal valor;
	
	CustoProduto(BigDecimal valor){
		this.valor = valor;		
	}
	
	public BigDecimal getValor() {
		return valor;		
	}
}
