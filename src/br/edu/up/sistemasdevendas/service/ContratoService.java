package br.edu.up.sistemasdevendas.service;

import java.util.List;

import br.edu.up.sistemasdevendas.dao.ContratoDao;
import br.edu.up.sistemasdevendas.dao.Dao;
import br.edu.up.sistemasdevendas.dao.FactoryDao;
import br.edu.up.sistemasdevendas.entity.Contrato;

public class ContratoService {
	
	public void salvar(Contrato contrato) {

		Dao<Contrato> contratoDao = new ContratoDao();
		contratoDao.salvar(contrato);
		
	}
	
	public Contrato buscar(Integer i) {
		Dao<Contrato> contratoDao = FactoryDao.createContratoDao();
		contratoDao.buscar(i);
		return contratoDao.buscar(i);
	}
	
	public void alterar(Contrato c)  throws ServiceException {
		if(c.getId() == null) {
			throw new ServiceException("nao tem");
		}
		Dao<Contrato> contratoDao = FactoryDao.createContratoDao();
		
				contratoDao.alterar(c);
	}
	
	public List<Contrato> listar() {
		
		Dao<Contrato> contratoDao = FactoryDao.createContratoDao();
		
		return contratoDao.listar();
	}
	
	public void excluir(Contrato c)  throws ServiceException {
		if(c.getId() == null) {
			throw new ServiceException("nao tem");
		}
		Dao<Contrato> contratoDao = FactoryDao.createContratoDao();
		
		contratoDao.excluir(c);
	}

		

}
