package br.edu.up.sistemasdevendas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.up.sistemasdevendas.entity.Banco;
import br.edu.up.sistemasdevendas.service.BancoService;

public class TesteBanco {

	@Test
	public void deveriaCadastrarUmBanco() {

		Banco b = new Banco();
		b.setId(null);
		b.setNome("BBBB");
		new BancoService().salvar(b);
		

		assertEquals(true, b.getId() != null);

	}
}