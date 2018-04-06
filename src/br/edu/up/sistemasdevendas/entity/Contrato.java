package br.edu.up.sistemasdevendas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="CONTRATO")
@Entity
public class Contrato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Banco banco;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	

}
