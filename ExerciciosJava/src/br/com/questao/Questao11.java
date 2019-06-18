package br.com.questao;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cont, acresc, total;
		
		cont = Teclado.lerDouble("Digite o valor da conta: ");
		
		acresc = 0.10;
		
		total = cont + (cont * acresc);
		
		System.out.println("O valor da conta com o acrescimo de gorgeta do cliente é: " 
							+ total );
		
	
	}

}
