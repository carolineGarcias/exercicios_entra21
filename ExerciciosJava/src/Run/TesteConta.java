package Run;

import java.util.Random;

import orientacao_a_objetos.Agencia;
import orientacao_a_objetos.CartaodeCredito;
import orientacao_a_objetos.Cliente;
import orientacao_a_objetos.Conta;

public class TesteConta {

	
    public static void main(String[] args) {
			
    	Agencia Agencia1 = new Agencia();
		Agencia Agencia2 = new Agencia();

    	Cliente Cliente1 = new Cliente();
		Cliente Cliente2 = new Cliente();
	
		Conta NewConta1 = new Conta();
    	Conta NewConta2 = new Conta();

		Random numb = new Random();	
		
		Agencia1.numb_ag = 1 + numb.nextInt(2000);
		Agencia2.numb_ag = 1 + numb.nextInt(2000);
		
    	NewConta1.numc_cc = 1 + numb.nextInt(99999);
    	NewConta1.saldo_cc = 1100;
    	NewConta1.limite_cc = 100;
    	NewConta1.numb_ag = Agencia1.numb_ag;
    	
    	NewConta2.numc_cc = 1 + numb.nextInt(99999);
    	NewConta2.saldo_cc = 2200;
    	NewConta2.limite_cc = 100;
    	NewConta2.numb_ag = Agencia2.numb_ag;
		
		Cliente1.clt_nm = "Caroline Rocha";
		Cliente1.cd_clt = 1 + numb.nextInt(9999);
		Cliente2.clt_nm = "Aisha Tillmann";
		Cliente2.cd_clt = 1 + numb.nextInt(9999);
		
		CartaodeCredito Cartao1 = new CartaodeCredito();
		CartaodeCredito Cartao2 = new CartaodeCredito();	
			
		Cartao1.numb_cartao = 1 + numb.nextInt(2000);
		Cartao1.dt_valid = "01/01/1010";	
			
		Cartao2.numb_cartao = 1 + numb.nextInt(2000);;
		Cartao2.dt_valid = "02/02/2020";
	
		System.out.println("Cliente: "+ Cliente1.clt_nm + "\n" + "Conta: " + Cliente1.cd_clt + 
						   "\n" + "Número Cartão: " + Cartao1.numb_cartao + 
						   "\n" + "Data de validade: " + Cartao1.dt_valid);
		NewConta1.RunExtrato();
		
		System.out.println(" ");
		System.out.println("Cliente: "+ Cliente2.clt_nm + "\n" + "Conta: " + Cliente2.cd_clt +
						   "\n" + "Número Cartão: " + Cartao2.numb_cartao + 
						   "\n" + "Data de validade: " + Cartao2.dt_valid);
		NewConta2.RunExtrato();
		
	}

}
