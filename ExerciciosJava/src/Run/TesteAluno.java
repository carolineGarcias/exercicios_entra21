package Run;

import orientacao_a_objetos.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno nm_aluno =  new  Aluno ();

		nm_aluno.nm_aluno        = "Caroline Rocha";
		nm_aluno.rg_aluno        =  1234567;
		nm_aluno.date_nasc_aluno = "01/01/1010";

		System.out.println("Aluno(a): " +nm_aluno.nm_aluno);
		System.out.println("RG: " + nm_aluno.rg_aluno);
		System.out.println("Data de nascimento: " + nm_aluno.date_nasc_aluno);
	
	}

}
