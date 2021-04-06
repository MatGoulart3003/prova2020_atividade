package br.edu.univas.vo;

import java.util.ArrayList;

public class Estabelecimento {
	
	private String nome;
	private ArrayList<Cardapio> lista = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Cardapio> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Cardapio> lista) {
		this.lista = lista;
	}
	
	
	
	
}
