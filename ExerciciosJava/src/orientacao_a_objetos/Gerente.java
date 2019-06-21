package orientacao_a_objetos;

public class Gerente {

	public String nm_geren;
	public double sal_geren;
	public int aumet_sal_geren;
	
	public void dados_gerente() {
		System.out.println("Nome: " + this.nm_geren);
		System.out.println("Salário: " + this.sal_geren);
	}
	public void aumento_sal() {
		this.sal_geren += this.sal_geren * 0.1;
		this.aumet_sal_geren++;
		System.out.println("Nome: " + this.nm_geren);
		System.out.println("Salário atualizado + 10%: R$ " + this.sal_geren);	
	}
	public void amento_sal_variavel(double aumtn) { 
		this.sal_geren += this.sal_geren * (aumtn / 100);
		this.aumet_sal_geren++;
		System.out.println("Nome: " + this.nm_geren);
		System.out.println("Salário atualizado + %: R$ " + this.sal_geren);
		
	}	
}
