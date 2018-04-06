package br.edu.up.sistemasdevendas.service;

import br.edu.up.sistemasdevendas.dao.Dao;
import br.edu.up.sistemasdevendas.dao.StatusDao;
import br.edu.up.sistemasdevendas.entity.Status;

public class StatusService {
	
	public void salvar(Status status) {
		Dao<Status> statusDao = new StatusDao();
		statusDao.salvar(status);
		
	}

}
