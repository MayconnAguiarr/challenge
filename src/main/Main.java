package main;

import java.util.List;

import model.Ingrediente;
import services.CarrinhoDeCompra;
import services.Pizza;

public class Main {

	public static void main(String[] args) {

		Ingrediente ingrediente1 = new Ingrediente("Presunto", 2);
		Ingrediente ingrediente2 = new Ingrediente("Mussarela", 3);
		Ingrediente ingrediente3 = new Ingrediente("Ovo", 1);
		Ingrediente ingrediente4 = new Ingrediente("Tomate", 2);
		Ingrediente ingrediente5 = new Ingrediente("Cebola", 3);
		Ingrediente ingrediente6 = new Ingrediente("Azeitona", 1);
		Ingrediente ingrediente7 = new Ingrediente("Orégano", 2);

		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente1);
		pizza.adicionaIngrediente(ingrediente2);
		pizza.adicionaIngrediente(ingrediente3);

		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente(ingrediente4);
		pizza1.adicionaIngrediente(ingrediente7);
		pizza1.adicionaIngrediente(ingrediente1);
		pizza1.adicionaIngrediente(ingrediente2);
		pizza1.adicionaIngrediente(ingrediente6);
		pizza1.adicionaIngrediente(ingrediente3);
		pizza1.adicionaIngrediente(ingrediente5);

		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente(ingrediente7);
		pizza2.adicionaIngrediente(ingrediente2);

		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
		carrinhoDeCompra.addPizza(pizza);
		carrinhoDeCompra.addPizza(pizza1);
		carrinhoDeCompra.addPizza(pizza2);

		System.out.println("########################## Carrinho de Compra ########################################");

		for (int i = 0; i < carrinhoDeCompra.pizzas.size(); i++) {
			System.out.println("##### Pizza " + i + " #####");
			System.out.println("###Ingrediente / Quantidade");
			List<Ingrediente> ingredientes = carrinhoDeCompra.pizzas.get(i).ingredientes;

			for (int j = 0; j < ingredientes.size(); j++) {
				System.out.println(ingredientes.get(j).getNome() + "  -  " + ingredientes.get(j).getQuantidade());
			}	
			System.out.println("##Valor = " + carrinhoDeCompra.pizzas.get(i).getPreco());

			System.out.println("---------------------------------------------------------------------------------");
		}

		System.out.println("Total carrinho de compra - " + carrinhoDeCompra.valorTotalPizzas());
	}
}
