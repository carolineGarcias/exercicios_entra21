package br.com.questao;

public class Quest�o18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vlrprod, vlrprodvenda, acresc, totalvlr, acrescconv;
		
		vlrprod = Teclado.lerDouble("Digite o valor do produto: ");
		acresc = Teclado.lerDouble("Digite o percentual do produto para o pre�o de venda:");
		
		acrescconv = acresc/100;	
		vlrprodvenda = vlrprod * acrescconv;
		totalvlr = vlrprodvenda + vlrprod; 
		
		System.out.println("O pre�o de venda do produto �: " + totalvlr);
		
	}

}
