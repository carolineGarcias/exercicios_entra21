package Run;

import orientacao_a_objetos.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gerente Gerente1 = new Gerente();
		Gerente1.nm_geren = "Roberto";
		Gerente1.sal_geren = 3500;
		
		Gerente Gerente2 = new Gerente();
		Gerente2.nm_geren = "Carla";
		Gerente2.sal_geren = 5000;

		Gerente1.dados_gerente();
		Gerente1.aumento_sal();

		System.out.println(" ");
		
		Gerente2.dados_gerente();
		Gerente2.amento_sal_variavel(50);
		
		
	}

}
