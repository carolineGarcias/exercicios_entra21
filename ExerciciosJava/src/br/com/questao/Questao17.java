package br.com.questao;

public class Questao17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vlrcompra, presta��es;
		
		vlrcompra = Teclado.lerDouble("Digite o valor da compra: ");
		presta��es = Teclado.lerDouble("Digite a quantidade de presta��es escolhidas: ");
			 
		System.out.println("O valor das presta��es �: " + vlrcompra / presta��es);
		
	}
}