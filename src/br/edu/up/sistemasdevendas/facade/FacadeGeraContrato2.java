package br.edu.up.sistemasdevendas.facade;

import br.edu.up.sistemasdevendas.entity.Banco;
import br.edu.up.sistemasdevendas.entity.Cliente;
import br.edu.up.sistemasdevendas.entity.Contrato;
import br.edu.up.sistemasdevendas.service.BancoService;
import br.edu.up.sistemasdevendas.service.ClienteService;
import br.edu.up.sistemasdevendas.service.ContratoService;

public class FacadeGeraContrato2 {
	
	private String nomeCli = null;
	private Integer idadeCli = null;
	private Integer idBanco = null;

	public FacadeGeraContrato2(String nomeCli, Integer idadeCli, Integer idBanco) {
		this.nomeCli = nomeCli;
		this.idadeCli = idadeCli;
		this.idBanco = idBanco;
	}

	public void geraContrato() {
		ClienteService serviceCli = new ClienteService();
		BancoService serviceBan = new BancoService();
		ContratoService serviceCon = new ContratoService();
		
		Cliente c = new Cliente();
		Banco b = new Banco();
		Contrato con = new Contrato();
		
		c.setNome(nomeCli);
		c.setIdade(idadeCli);
		serviceCli.salvar(c);
		
		b = serviceBan.buscar(idBanco);
		
		con.setCliente(c);
		con.setBanco(b);
		
		serviceCon.salvar(con);
	}

}
