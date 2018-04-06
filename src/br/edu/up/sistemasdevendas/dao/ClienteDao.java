package br.edu.up.sistemasdevendas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.sistemasdevendas.entity.Cliente;

public class ClienteDao implements Dao<Cliente> {

	@Override
	public void salvar(Cliente cliente) {
		
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();	
		
		
	}

	@Override
	public void alterar(Cliente cliente) {
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		em.close();	
		
	}

	@Override
	public void excluir(Cliente cliente) {
		
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		cliente= em.find(Cliente.class, cliente.getId());
		
		em.remove(cliente);
		em.getTransaction().commit();
		em.close();	
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listar() {
		EntityManager em = new Conexao().getInstance();
		Query q = em.createQuery("select c from Cliente c");
		return q.getResultList();
	}

	@Override
	public Cliente buscar(Integer id) {
		EntityManager em = new Conexao().getInstance();
		
		return em.find(Cliente.class, id);
	}
	
	

}
