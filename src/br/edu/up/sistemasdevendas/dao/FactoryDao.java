package br.edu.up.sistemasdevendas.dao;

import br.edu.up.sistemasdevendas.entity.Cliente;
import br.edu.up.sistemasdevendas.entity.Banco;
import br.edu.up.sistemasdevendas.entity.Contrato;


public class FactoryDao {

	public static Dao<Cliente> createClienteDao(){
		return new ClienteDao();
	}
	
	public static Dao<Banco> createBancoDao(){
		return new BancoDao();
	}
	
	public static Dao<Contrato> createContratoDao(){
		return new ContratoDao();
	}
}
