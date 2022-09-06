package projetopizzaria;

import java.util.HashMap;
import java.util.Scanner;

public class pizza {
	public HashMap<String, Integer> pizza = new HashMap<String, Integer>();
	public int numerodeingredientes;

	
	int contabilizaingredientes(String ingrediente) {
		pizza.put(ingrediente, carrinho.ndopedido);
		numerodeingredientes++;
		return 0;
	}
	
	private int getpreco (int totaldeingredientes) {
		int preco = 0;
		if(totaldeingredientes <= 3 && totaldeingredientes != 0) {
			preco = 15;
			
		}
		
		if(totaldeingredientes >3 && totaldeingredientes < 5) {
			preco = 20;
		}
		
		if(totaldeingredientes > 5) {
			preco = 23;
		}
		carrinho.tingredientes.putAll(pizza);
		return preco;
	}
	
	public int adicionaingrediente(String ingrediente) {
		Scanner scan = new Scanner(System.in);
		boolean terminou = false;
		while(terminou == false) {
			ingrediente = scan.nextLine();
			if(ingrediente.equals("0")) {
				if(numerodeingredientes != 0) {
					terminou = true;
					break;
				}else {
					System.out.println("erro, escreva um ingrediente válido");
				}
			}
			if(!ingrediente.equals("0") && !ingrediente.equals(null)) {
				contabilizaingredientes(ingrediente);
			}
			
			if(ingrediente.equals(null) ||ingrediente.equals("")) {
				System.out.println("erro, escreva um ingrediente válido");
			}
	
		}
		if(terminou == true) {
			carrinho.retornavalores(getpreco(numerodeingredientes));
			
		}
		return 0;
	}
	
	public pizza(){
		adicionaingrediente("");
			
	}
}
