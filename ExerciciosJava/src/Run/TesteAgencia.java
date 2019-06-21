package Run;

import java.util.Random;

import orientacao_a_objetos.Agencia;

public class TesteAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agencia Agencia1 = new Agencia();
		
		Random numb = new Random();
		Agencia1.numb_ag = 1+ numb.nextInt(2000);
		
		System.out.println("Número Agência: " + Agencia1.numb_ag);
		
	}

}
