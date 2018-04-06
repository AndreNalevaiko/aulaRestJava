package br.edu.up.sistemasdevendas.facade;

public class FacadeTesteSistema {

	public FacadeTesteSistema(TesteBanco banco, TesteCliente cliente) {
		this.cliente = cliente;
		this.banco = banco;
	}

	public class TesteCliente {

		public void save() {
			System.out.println("Cadastrou cliente");
		}
		
		public void alter() {
			System.out.println("Editou Cliente");
		}
		
		public void search() {
			System.out.println("Busco Cliente");
		}
		
		public void delete() {
			System.out.println("Excluiu Cliente");
		}
	}

	public class TesteBanco {
		public void save() {
			System.out.println("Cadastrou Banco");
		}
		
		public void alter() {
			System.out.println("Editou Banco");
		}
		
		public void search() {
			System.out.println("Busco Banco");
		}
		
		public void delete() {
			System.out.println("Excluiu Banco");
		}
	}
	
	private TesteBanco banco = null;
	private TesteCliente cliente = null;



	public void ligarComputador() {
		cliente.save();
		cliente.alter();
		cliente.search();
		cliente.delete();
		
		banco.save();
		banco.alter();
		banco.search();
		banco.delete();
	}


}
