package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Cardapio;
import br.edu.univas.vo.Estabelecimento;
import br.edu.univas.vo.Lanchonete;
import br.edu.univas.vo.Pizzaria;
import br.edu.univas.vo.Restaurante;

public class StartApp {
	
	private static ArrayList<Estabelecimento> estabList = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	private static void main(String[] args) {
		
		int i = 0;
		
		do {
				
			
			System.out.println("Digite qual que tipo é o estabelecimento citado:");
			String aux = scan.nextLine();
			
			if(aux.equals("Lanchonete")) {
				
				Lanchonete lanchonete = new Lanchonete();
				lanchonete.setNome(scan.nextLine());
				Cardapio.addCardapio(aux);
				estabList.add(lanchonete);
				
			}else if(aux.equals("Pizzaria")) {
				
				Pizzaria pizzaria = new Pizzaria();
				pizzaria.setNome(scan.nextLine());
				Cardapio.addCardapio(aux);
				estabList.add(pizzaria);
				
			}else if (aux.equals("Restaurante")) {
				
				Restaurante restaurante = new Restaurante();
				restaurante.setNome(scan.nextLine());
				Cardapio.addCardapio(aux);
				estabList.add(restaurante);
				
			}else {
				
				System.out.println("Opção incorreta!!/n Digite uma opção válida!");
				i--;
			}
			
				
			
			i++;
		
		}while (i < 5);
		
		for(i = 0; i < estabList.size() ; i++) {
			Estabelecimento view = estabList.get(i);
			System.out.println(view.getNome());
			
		}
		
		scan.close();
	}

}
