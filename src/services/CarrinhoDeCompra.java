package services;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

	public List<Pizza> pizzas = new ArrayList<>();

	public void addPizza(Pizza pizza) {		
		this.pizzas.add(pizza);
	}

	public BigDecimal valorTotalPizzas() {
		BigDecimal valorTotalPizza = BigDecimal.ZERO;
		
		for (int i = 0; i < pizzas.size(); i++) {
			valorTotalPizza = valorTotalPizza.add(pizzas.get(i).getPreco());
		}
		return valorTotalPizza;
	}
}
