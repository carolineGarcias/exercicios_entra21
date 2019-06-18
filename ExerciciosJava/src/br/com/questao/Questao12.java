package br.com.questao;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hr, min, mihr;
		
		hr = Teclado.lerInt("Digite a hora: ");
		min = Teclado.lerInt("Digite os minuto: ");
		
		mihr = hr  * 60 + (min * 60) /60 ;
		
		System.out.println("Minutos somados: " + mihr);
		
		
		
		
	}

}
