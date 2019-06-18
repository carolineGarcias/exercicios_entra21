package br.com.questao;

public class Questao19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, mes, dia, idadedia;
		
		idade = Teclado.lerInt("Digite sua idade: ");
		idadedia = Teclado.lerInt("Digite os dias: ");
		
		dia = idadedia + (idade * 365);
		mes = idade * 12;	

		System.out.println("total meses: " + mes);
		System.out.println("total dias: "  + dia);		
		
	}

}
