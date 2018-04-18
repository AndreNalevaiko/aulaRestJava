package br.edu.up.sistemasdevendas.service;

import java.util.List;

import br.edu.up.sistemasdevendas.dao.BancoDao;
import br.edu.up.sistemasdevendas.dao.Dao;
import br.edu.up.sistemasdevendas.dao.FactoryDao;
import br.edu.up.sistemasdevendas.entity.Banco;

public class BancoService {	
		
		public void salvar(Banco banco){
			
			if (banco.getNome() == "" || banco.getNome() == null) {
				return;
			}
							
			Dao<Banco> bancoDao = new BancoDao();
			bancoDao.salvar(banco);
					
		}
		
		public Banco buscar(Integer i) {
			Dao<Banco> bancoDao = FactoryDao.createBancoDao();
			bancoDao.buscar(i);
			return bancoDao.buscar(i);
		}
		
		public void alterar(Banco b)  throws ServiceException {
			if (b.getNome() == "" || b.getNome() == null) {
				return;
			}
			if(b.getId() == null) {
				throw new ServiceException("nao tem");
			}
			Dao<Banco> bancoDao = FactoryDao.createBancoDao();
			
			bancoDao.alterar(b);
		}
		
		public List<Banco> listar() {
			
			Dao<Banco> bancoDao = FactoryDao.createBancoDao();
			
			return bancoDao.listar();
		}
		
		public void excluir(Banco b)  throws ServiceException {
			if(b.getId() == null) {
				throw new ServiceException("nao tem");
			}
			Dao<Banco> bancoDao = FactoryDao.createBancoDao();
			
			bancoDao.excluir(b);
		}

}
