package br.edu.up.sistemasdevendas.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.edu.up.sistemasdevendas.entity.Contrato;
import br.edu.up.sistemasdevendas.service.ContratoService;
import br.edu.up.sistemasdevendas.facade.FacadeGeraContrato2;

@Path("/contrato")
public class ContratoRest {
	
	public class GenerateWithoutCustomer{
		public String nomeCustomer;
		public Integer idadeCustomer;
		public Integer idBanco;
		
		public String getNomeCustomer() {
			return nomeCustomer;
		}
		public void setNomeCustomer(String nomeCustomer) {
			this.nomeCustomer = nomeCustomer;
		}
		public Integer getIdadeCustomer() {
			return idadeCustomer;
		}
		public void setIdadeCustomer(Integer idadeCustomer) {
			this.idadeCustomer = idadeCustomer;
		}
		public Integer getIdBanco() {
			return idBanco;
		}
		public void setIdBanco(Integer idBanco) {
			this.idBanco = idBanco;
		}
	}
	
	public class GenerateWithCustomer{
		public Integer idCustomer;
		public Integer idBanco;
		
		public Integer getIdCustomer() {
			return idCustomer;
		}
		public void setIdCustomer(Integer idadeCustomer) {
			this.idCustomer = idadeCustomer;
		}
		public Integer getIdBanco() {
			return idBanco;
		}
		public void setIdBanco(Integer idBanco) {
			this.idBanco = idBanco;
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contrato> listar() {
		return new ContratoService().listar();
		
	}
	
	@POST
	@Path("/generateWithoutCustomer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	//public Contrato generateWithoutCustomer(GenerateWithoutCustomer data) {
	public Contrato generateWithoutCustomer(@QueryParam("nomeCli") String nomeCli,
			@QueryParam("idadeCli") Integer idadeCli, @QueryParam("idBanco") Integer idBanco) {	
		Contrato c = new Contrato();
		FacadeGeraContrato2 facade = new FacadeGeraContrato2();
		facade.setIdadeCli(idadeCli);
		facade.setNomeCli(nomeCli);
		facade.setIdBanco(idBanco);
		
		
		try {
			c = facade.geraContrato();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	@POST
	@Path("/generateWithCustomer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Contrato generateWithCustomer(@QueryParam("idCliente") Integer idCliente, @QueryParam("idBanco") Integer idBanco) {
		Contrato c = new Contrato();
		FacadeGeraContrato2 facade = new FacadeGeraContrato2();
		facade.setIdBanco(idBanco);
		facade.setIdCli(idCliente);
		
		try {
			c = facade.geraContrato();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	
	@POST
	@Path("/alterar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Contrato alterar(Contrato contrato) {
		try {
			new ContratoService().alterar(contrato);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return contrato;
	}
	
	@POST
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(Contrato contrato) {
		try {
			new ContratoService().excluir(contrato);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}