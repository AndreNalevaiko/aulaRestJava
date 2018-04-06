package br.edu.up.sistemasdevendas.dao;

import java.util.List;

import br.edu.up.sistemasdevendas.entity.Status;

public class StatusDao implements Dao<Status> {

	@Override
	public void salvar(Status status) {
		
		status.setId(1);
	}

	@Override
	public void alterar(Status status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Status status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Status> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
