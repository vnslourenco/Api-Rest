package com.usuarios.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nomeRua;
	private int numero;
	private String tipoDeEndereco;
	
	public String getNomeRua() {
		return nomeRua;
	}
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipoDeEndereco() {
		return tipoDeEndereco;
	}
	public void setTipoDeEndereco(String tipoDeEndereco) {
		this.tipoDeEndereco = tipoDeEndereco;
	}
	
		

}
