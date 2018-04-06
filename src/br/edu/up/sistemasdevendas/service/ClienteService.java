package br.edu.up.sistemasdevendas.service;


import java.util.List;

import br.edu.up.sistemasdevendas.dao.Dao;
import br.edu.up.sistemasdevendas.dao.FactoryDao;
import br.edu.up.sistemasdevendas.entity.Cliente;

public class ClienteService {
	
	public void salvar(Cliente cliente) {
		
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		clienteDao.salvar(cliente);
				
	}
	
	public Cliente buscar(Integer i) {
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		clienteDao.buscar(i);
		return clienteDao.buscar(i);
	}
	
	public void alterar(Cliente c)  throws ServiceException {
		if(c.getId() == null) {
			throw new ServiceException("nao tem");
		}
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		
		clienteDao.alterar(c);
	}
	
	public List<Cliente> listar() {
		
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		
		return clienteDao.listar();
	}
	
	public void excluir(Cliente c)  throws ServiceException {
		if(c.getId() == null) {
			throw new ServiceException("nao tem");
		}
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		
		clienteDao.excluir(c);
	}

}
