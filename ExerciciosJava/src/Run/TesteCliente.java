package Run;

import java.util.Random;

import orientacao_a_objetos.CartaodeCredito;
import orientacao_a_objetos.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente Cliente1 = new Cliente();
		Cliente Cliente2 = new Cliente();
		
		Random numb = new Random();
		Cliente1.cd_clt = 1 + numb.nextInt(99999);
		Cliente1.clt_nm = "Caroline Rocha";		
		
		Cliente2.clt_nm = "Aisha Tilmann";
		Cliente2.cd_clt = 1 + numb.nextInt(99999);
		System.out.println("Cliente: " + Cliente1.clt_nm + 
						   "\n" + "Código cliente: " + Cliente1.cd_clt);
		System.out.println(" ");
		
		System.out.println("Cliente: " + Cliente2.clt_nm + 
						   "\n" + "Código cliente: " + Cliente2.cd_clt);
		
	}

}
