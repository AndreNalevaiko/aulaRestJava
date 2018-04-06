package br.edu.up.sistemasdevendas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.sistemasdevendas.entity.Contrato;

public class ContratoDao implements Dao<Contrato> {

	@Override
	public void salvar(Contrato contrato) {
		
		
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		em.persist(contrato);
		em.getTransaction().commit();
		em.close();	
	}

	@Override
	public void alterar(Contrato contrato) {
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		em.merge(contrato);
		em.getTransaction().commit();
		em.close();	
		
	}

	@Override
	public void excluir(Contrato contrato) {
		EntityManager em = new Conexao().getInstance();
		em.getTransaction().begin();
		contrato = em.find(Contrato.class, contrato.getId());
		
		em.remove(contrato);
		em.getTransaction().commit();
		em.close();	
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contrato> listar() {
		EntityManager em = new Conexao().getInstance();
		Query q = em.createQuery("select c from Contrato c");
		return q.getResultList();
	}

	@Override
	public Contrato buscar(Integer id) {
		EntityManager em = new Conexao().getInstance();
		
		return em.find(Contrato.class, id);
	}

}
