package br.edu.up.sistemasdevendas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import br.edu.up.sistemasdevendas.entity.Cliente;
import br.edu.up.sistemasdevendas.service.ClienteService;
import br.edu.up.sistemasdevendas.service.ServiceException;

public class TesteCliente {
	
	static Integer id;

	@Test
	public void deveriaCadastrarUmCliente() {

		Cliente c = new Cliente();
		c.setId(null);
		c.setNome("AAAAA");
		c.setIdade(18);

		new ClienteService().salvar(c);


		assertEquals(true, c.getId() != null);
		id = c.getId();
	}
	
	@Test
	public void deveriaAlterarUmCliente() {
		
		ClienteService s = new ClienteService();
		
		Cliente c = s.buscar(id);
		c.setNome("abc");

		
		try {
			new ClienteService().alterar(c);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		

		assertEquals(true, c.getId() != null);

	}
	
	@Test
	public void deveriaListarClientes() {
		
		ClienteService s = new ClienteService();
		List<Cliente> clientes = s.listar();
		
		assertEquals(true, clientes.size()>0);

	}
	
	@Test
	public void deveriaExcluirUmCliente() {
		
		ClienteService s = new ClienteService();
		
		Cliente c = s.buscar(id);
		
		try {
			new ClienteService().excluir(c);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		
		c = s.buscar(id);

		assertEquals(true, c != null);

	}



}
