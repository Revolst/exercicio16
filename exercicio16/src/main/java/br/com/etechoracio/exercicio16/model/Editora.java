package br.com.etechoracio.exercicio16.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_EDITORA")
public class Editora {
	
	@GeneratedValue
	@Id
	@Column(name="ID_EDITORA")
	private	Long	id;
	
	@Column(name="TX_NOME")
	private	String	nome;
	
	@Column(name="TX_EMAIL")
	private	String	email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
