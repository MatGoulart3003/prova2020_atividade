package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cardapio {
	
	private String nomeCard; 
	private static ArrayList<String> lista = new ArrayList<>();
	
	
	public String getNomeCard() {
		return nomeCard;
	}
	public void setNomeCard(String nomeCard) {
		this.nomeCard = nomeCard;
	}
	public ArrayList<String> getLista() {
		return lista;
	}
	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
	
	public static void addCardapio(String nome) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um produto pro cardápio");
		nome = scan.nextLine();
		
		lista.add(nome);
		scan.close();
	}
	
}
