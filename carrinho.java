package projetopizzaria;

import java.util.HashMap;

public class carrinho {
	public static int precototal;
	public static int ndopedido;
	public static HashMap<String, Integer> tingredientes = new HashMap<String, Integer>();
	
	public static int retornavalores(int precoind) {
		precototal += precoind;
		ndopedido+= 1;
		
		return 0;
	}
	public carrinho() {
		System.out.println("preço total: " + precototal);
		
	}
}
