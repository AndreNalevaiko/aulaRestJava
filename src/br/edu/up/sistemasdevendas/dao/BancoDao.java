package br.edu.up.sistemasdevendas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.sistemasdevendas.entity.Banco;

public class BancoDao implements Dao<Banco> {

	@Override
	public void salvar(Banco banco) {
		
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		em.persist(banco);
		em.getTransaction().commit();
		em.close();			
	}

	@Override
	public void alterar(Banco banco) {
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		em.merge(banco);
		em.getTransaction().commit();
		em.close();	
		
	}

	@Override
	public void excluir(Banco banco) {
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		banco = em.find(Banco.class, banco.getId());
		
		em.remove(banco);
		em.getTransaction().commit();
		em.close();	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Banco> listar() {
		EntityManager em = new Conexao().getInstance();
		Query q = em.createQuery("select b from Banco b");
		return q.getResultList();
	}

	@Override
	public Banco buscar(Integer id) {
		EntityManager em = new Conexao().getInstance();
		
		return em.find(Banco.class, id);
	}
	
	

}
