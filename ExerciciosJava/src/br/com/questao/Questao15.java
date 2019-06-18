package br.com.questao;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numb1, numb2;
		int soma, sub, div, multi;
		
		
	
	numb1 = Teclado.lerInt("Digite o 1º número: ");
	numb2 = Teclado.lerInt("Digite o 2º número: ");
	
	soma = numb1 + numb2;
	sub = numb2 - numb1;
	multi = numb1 * numb2;
	div = numb1 / numb2;
	
	System.out.println("Os calculos são: " +
						"\n" + "Soma: "        + soma +
						"\n" + "Subtração: "   + sub +
						"\n" + "Multiplicão: " + multi +
						"\n" + "Divisão: "     + div);
	
	}

}
