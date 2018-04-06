package br.edu.up.sistemasdevendas.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.sistemasdevendas.entity.Banco;
import br.edu.up.sistemasdevendas.service.BancoService;

@Path("/banco")
public class BancoRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Banco> listar() {
		return new BancoService().listar();
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Banco salvar(Banco Banco) {
		try {
			new BancoService().salvar(Banco);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Banco;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Banco alterar(Banco Banco) {
		try {
			new BancoService().alterar(Banco);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Banco;
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(Banco Banco) {
		try {
			new BancoService().excluir(Banco);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}