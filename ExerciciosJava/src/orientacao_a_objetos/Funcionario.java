package orientacao_a_objetos;

public class Funcionario {

	public String nome_func;
	public double sal_func;
	public int aum_sal_func;
	

	public void new_sal(double vlr_aumento) {
		this.sal_func += vlr_aumento;
		this.aum_sal_func++;
		System.out.println("Funcion�rio: " + this.nome_func);
		System.out.println("Aumento : R$ " + vlr_aumento);
		System.out.println("Sal�rio Atual: R$ " + this.sal_func);
	}
	public void dados_func() {
		System.out.println("Funcion�rio: " + this.nome_func);
		System.out.println("Sal�rio Funcion�rio: R$ " + this.sal_func);
	}	
}
