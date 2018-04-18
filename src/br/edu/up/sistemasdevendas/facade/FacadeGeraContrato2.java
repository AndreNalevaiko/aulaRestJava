package br.edu.up.sistemasdevendas.facade;

import br.edu.up.sistemasdevendas.entity.Banco;
import br.edu.up.sistemasdevendas.entity.Cliente;
import br.edu.up.sistemasdevendas.entity.Contrato;
import br.edu.up.sistemasdevendas.service.BancoService;
import br.edu.up.sistemasdevendas.service.ClienteService;
import br.edu.up.sistemasdevendas.service.ContratoService;

public class FacadeGeraContrato2 {
	
	private Integer idCli = null;
	private String nomeCli = null;
	private Integer idadeCli = null;
	private Integer idBanco = null;

	public Integer getIdCli() {
		return idCli;
	}

	public void setIdCli(Integer idCli) {
		this.idCli = idCli;
	}

	public String getNomeCli() {
		return nomeCli;
	}

	public void setNomeCli(String nomeCli) {
		this.nomeCli = nomeCli;
	}

	public Integer getIdadeCli() {
		return idadeCli;
	}

	public void setIdadeCli(Integer idadeCli) {
		this.idadeCli = idadeCli;
	}

	public Integer getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
	}

	public Contrato geraContrato() {
		ClienteService serviceCli = new ClienteService();
		BancoService serviceBan = new BancoService();
		ContratoService serviceCon = new ContratoService();
		
		Cliente c = new Cliente();
		Banco b = new Banco();
		Contrato con = new Contrato();
		
		if (this.idCli != null) {
			c = serviceCli.buscar(this.idCli);
		}else{
			c.setNome(nomeCli);
			c.setIdade(idadeCli);
			serviceCli.salvar(c);
		}
		
		
		
		b = serviceBan.buscar(idBanco);
		
		con.setCliente(c);
		con.setBanco(b);
		
		serviceCon.salvar(con);
		
		return con;
	}

}
