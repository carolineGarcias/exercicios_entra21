package br.com.questao;

public class Quest�o20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double eleitores, validos, brancos, nulos;
		
	eleitores = Teclado.lerDouble("Digite o total de eleitores: ");
	
	validos = Teclado.lerDouble("Total votos validos: ");
	validos = (validos * 100) / eleitores;
	brancos = Teclado.lerDouble("Total votos brancos: ");
	brancos = (brancos * 100) / eleitores;
	nulos = Teclado.lerDouble("Total votos nulos: ");
	nulos = (nulos * 100 ) / eleitores;
	
	System.out.println("Porcentagem de votos validos �: " + validos + "%");
	System.out.println("Porcentagem de votos brancos �: " + brancos + "%");
	System.out.println("Porcentagem de votos nulos �: " + nulos + "%");

	}

}
