package orientacao_a_objetos;

public class Conta {

	public int numc_cc;
	public double saldo_cc;
	public double limite_cc = 100;
	public int numb_ag;
	
	public void saque(double vlr) {
		this.saldo_cc -= vlr;
	}
	public void desposita(double vlr) {
		this.saldo_cc += vlr;
	}
	public double saldo() {
		return this.saldo_cc;
	}
	public void RunExtrato(){
		System.out.println("Agencia: " + this.numb_ag);
		System.out.println("Numero Conta: " + this.numc_cc);
		System.out.println("Saldo Conta: R$ " + this.saldo_cc);
		System.out.println("Limite Conta: R$ " + this.limite_cc);
	}
}

