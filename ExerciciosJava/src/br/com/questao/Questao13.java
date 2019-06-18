package br.com.questao;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double kg, mt, gr, cm;
		
		kg = Teclado.lerDouble("Digite seu peso: ");
		mt = Teclado.lerDouble("Digite sua altura: ");
		
		gr = kg * 100;
		cm = mt * 100;
		
		System.out.println("Seu peso convertido em gramas é: "
							+ gr + "\n"
							+ "sua altura convertida em centimetor é: "
							+ cm);
		
		
		
		
	}

}
