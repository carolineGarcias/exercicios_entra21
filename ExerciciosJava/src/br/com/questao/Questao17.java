package br.com.questao;

public class Questao17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vlrcompra, prestações;
		
		vlrcompra = Teclado.lerDouble("Digite o valor da compra: ");
		prestações = Teclado.lerDouble("Digite a quantidade de prestações escolhidas: ");
			 
		System.out.println("O valor das prestações é: " + vlrcompra / prestações);
		
	}
}