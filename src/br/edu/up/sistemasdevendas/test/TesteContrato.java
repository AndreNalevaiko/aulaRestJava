package br.edu.up.sistemasdevendas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.up.sistemasdevendas.entity.Contrato;
import br.edu.up.sistemasdevendas.service.ContratoService;
import br.edu.up.sistemasdevendas.service.ServiceException;

public class TesteContrato {
	
	@Test
	public void deveriaCadastrarUmContrato() {

		Contrato c = new Contrato();
		c.setId(null);
		
		new ContratoService().salvar(c);


		assertEquals(true, c.getId() != null);

	}

}
