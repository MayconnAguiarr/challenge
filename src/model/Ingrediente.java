package model;

public class Ingrediente {

	private String nome;
	private int quantidade;

	public Ingrediente(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}
}
