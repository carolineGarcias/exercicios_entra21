package br.com.questao;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		double sal, comi, vendas, total;
		
		
		nome = Teclado.lerTexto("Digite o nome do vendedor: ");
		sal = Teclado.lerDouble("Digite o sal�rio de " + nome + ":");
		vendas = Teclado.lerDouble("Digite o total de vendas de: " + nome);
		
		comi = 0.15;
		total = sal + (vendas * comi);
		
		System.out.println("--------------------------------------");
		System.out.println("Funcion�rio: " + nome);
		System.out.println("Sal�rio: " + sal);
		System.out.println("Comiss�o: " + vendas);
		System.out.println("---------------------------------------");
		System.out.println("O sal�rio com comiss�o do funcion�rio " +
							nome + " �: " + total);
		
		
	}
}
