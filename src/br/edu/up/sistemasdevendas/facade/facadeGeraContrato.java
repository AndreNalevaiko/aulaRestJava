package br.edu.up.sistemasdevendas.facade;

import br.edu.up.sistemasdevendas.entity.Banco;
import br.edu.up.sistemasdevendas.entity.Cliente;
import br.edu.up.sistemasdevendas.entity.Contrato;
import br.edu.up.sistemasdevendas.service.BancoService;
import br.edu.up.sistemasdevendas.service.ClienteService;
import br.edu.up.sistemasdevendas.service.ContratoService;

public class facadeGeraContrato {
	
	public class cliente {
		
		public Cliente criarCliente(String nome, Integer idade) {
			Cliente c = new Cliente();
			c.setId(null);
			c.setNome(nome);
			c.setIdade(idade);
			
			new ClienteService().salvar(c);
			
			return c;
		}
		
		public Cliente buscarCliente(Integer id) {
			ClienteService service = new ClienteService();
			
			Cliente c = service.buscar(id);
			
			return c;
		}
	}
	
	public class banco{
		
		public Banco buscarBanco(Integer id) {
			BancoService service = new BancoService();
			
			Banco b = service.buscar(id);
			
			return b;	
		}
	}
	
	public class contrato{
		public void geraContrato(Cliente c, Banco b) {
			ContratoService service = new ContratoService();
			Contrato contract = new Contrato();
			
			contract.setCliente(c);
			contract.setBanco(b);
			
			service.salvar(contract);
		}
	}
	

	private cliente clienteContrato = null;
	private banco bancoContrato = null;
	private contrato contrato = null;
	
	public void GeraContrato(cliente cli, banco ban) {
		this.clienteContrato = cli;
		this.bancoContrato = ban;
	}
	
	public void geraContratoClienteNovo(String nomeCli, Integer idadeCli, Integer idBanco) {
		Cliente c = clienteContrato.criarCliente(nomeCli, idadeCli);
		Banco b = bancoContrato.buscarBanco(idBanco);
			
			
		
	}	

	
}
