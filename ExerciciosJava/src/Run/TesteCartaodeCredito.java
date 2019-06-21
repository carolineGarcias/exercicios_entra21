package Run;

import java.util.Random;

import orientacao_a_objetos.CartaodeCredito;
import orientacao_a_objetos.Cliente;

public class TesteCartaodeCredito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CartaodeCredito Cartao1 = new CartaodeCredito();
		
		Random numb = new Random();
		Cliente Cliente1        = new Cliente();
		Cartao1.Cliente = Cliente1;
		Cliente1.clt_nm = "Caroline Rocha";
		Cliente1.cd_clt = 1 + numb.nextInt(99999);
			
		Cartao1.numb_cartao = 1 + numb.nextInt(165983);
		Cartao1.dt_valid = "02/02/2020";
		Cartao1.Cliente.cd_clt = Cliente1.cd_clt;
		
		System.out.println("Cliente: " + Cliente1.clt_nm + 
						   "\n" + "Código Cliente: " + Cliente1.cd_clt + 
						   "\n" + "Número cartão de crédito: " + Cartao1.numb_cartao + 
						   "\n" + "Data de validade do cartão: " + Cartao1.dt_valid);

	}

}
