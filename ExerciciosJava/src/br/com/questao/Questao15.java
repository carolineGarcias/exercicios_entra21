package br.com.questao;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numb1, numb2;
		int soma, sub, div, multi;
		
		
	
	numb1 = Teclado.lerInt("Digite o 1� n�mero: ");
	numb2 = Teclado.lerInt("Digite o 2� n�mero: ");
	
	soma = numb1 + numb2;
	sub = numb2 - numb1;
	multi = numb1 * numb2;
	div = numb1 / numb2;
	
	System.out.println("Os calculos s�o: " +
						"\n" + "Soma: "        + soma +
						"\n" + "Subtra��o: "   + sub +
						"\n" + "Multiplic�o: " + multi +
						"\n" + "Divis�o: "     + div);
	
	}

}
