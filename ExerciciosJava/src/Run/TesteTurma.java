package Run;

import orientacao_a_objetos.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Turma TurmaA = new Turma();
		TurmaA.periodo_turma = "Nortuno" ;
		TurmaA.serie_turma = 3;
		TurmaA.sigla_turma = "C" ;

		Turma  TurmaB =  new Turma();
		TurmaB.periodo_turma= "Matutino" ;
		TurmaB.serie_turma = 5;
		TurmaB.sigla_turma= "D" ;
		
		System.out.println("Per�odo Turma A: " + TurmaA.periodo_turma);
		System.out.println("S�rie Turma A: " + TurmaA.serie_turma+  " � ano " );
		System.out.println("Sigla Turma A: " + TurmaA.sigla_turma);
		System.out.println(" ");
		System.out.println("Per�odo Turma B: " + TurmaB.periodo_turma);
		System.out.println("S�rie Turma B: " + TurmaB.serie_turma +  " � s�rie" );
		System.out.println("Sigla Turma B: " + TurmaB.sigla_turma);		
	}

}
