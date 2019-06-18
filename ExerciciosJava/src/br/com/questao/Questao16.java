package br.com.questao;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		double sal, comi, vendas, total;
		
		
		nome = Teclado.lerTexto("Digite o nome do vendedor: ");
		sal = Teclado.lerDouble("Digite o salário de " + nome + ":");
		vendas = Teclado.lerDouble("Digite o total de vendas de: " + nome);
		
		comi = 0.15;
		total = sal + (vendas * comi);
		
		System.out.println("--------------------------------------");
		System.out.println("Funcionário: " + nome);
		System.out.println("Salário: " + sal);
		System.out.println("Comissão: " + vendas);
		System.out.println("---------------------------------------");
		System.out.println("O salário com comissão do funcionário " +
							nome + " é: " + total);
		
		
	}
}
