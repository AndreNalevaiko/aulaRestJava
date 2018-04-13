package br.edu.up.sistemasdevendas.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.sistemasdevendas.entity.Cliente;
import br.edu.up.sistemasdevendas.service.ClienteService;

@Path("/cliente")
public class ClienteRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> listar() {
		return new ClienteService().listar();
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Cliente salvar(Cliente cliente) {
		try {
			new ClienteService().salvar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;
	}
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Cliente alterar(Cliente cliente) {
		try {
			new ClienteService().alterar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cliente;
	}
	
	@POST
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(Cliente cliente) {
		try {
			new ClienteService().excluir(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}