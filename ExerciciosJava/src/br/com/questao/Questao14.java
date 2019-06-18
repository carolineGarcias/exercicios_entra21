package br.com.questao;

public class Questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double kg, mt, imc;
		
		kg = Teclado.lerDouble("Digite seu peso: ");
		mt = Teclado.lerDouble("Digite sua altura: ");
		
		
		imc = kg / (mt*mt);
		
		System.out.println("Seu IMC é: " + imc);
		
	}

}
