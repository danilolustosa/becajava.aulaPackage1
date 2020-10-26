package aulaPackage1;

import model.*;

public class Main {

	public static void main(String[] args) {		
		
		Cliente cliente = new Cliente();		
		cliente.Nome = "Fulano";
		cliente.Idade = 20;
		
		
		Fornecedor fornecedor = new Fornecedor();		
		fornecedor.Nome = "Maria";
		fornecedor.Telefone = "1234567890";	
		
		
		Fornecedor fornecedor2 = new Fornecedor();
		fornecedor2.Nome = "Cecília";
		fornecedor2.Telefone = "11111111";

	}

}
