package br.edu.up.sistemasdevendas.test;


import org.junit.Test;

import br.edu.up.sistemasdevendas.facade.FacadeGeraContrato2;

public class TesteFacade {
	
	@Test
	public void deveriaCriarContrato() {
		
		FacadeGeraContrato2 teste = new FacadeGeraContrato2("Andre", 20, 1);
		
		teste.geraContrato();
	}

}
