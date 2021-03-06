package br.edu.up.sistemasdevendas.dao;

import java.util.List;

public interface Dao<T> {
	
	public void salvar(T t);
	public void alterar(T t);
	public void excluir(T t);
	public List<T> listar();
	public T buscar(Integer id);

}
