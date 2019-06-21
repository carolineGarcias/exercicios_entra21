package Run;

import orientacao_a_objetos.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario Funcionario1 = new Funcionario();
		Funcionario1.nome_func = "Rodolfo";
		Funcionario1.sal_func  = 2000;
		
		Funcionario Funcionario2 = new Funcionario();
		Funcionario2.nome_func = "Beto";
		Funcionario2.sal_func  = 3000;
		
		Funcionario1.dados_func();
		Funcionario1.new_sal(200);
		System.out.println(" ");
		Funcionario2.dados_func();
		Funcionario2.new_sal(550);

	
	}


}
