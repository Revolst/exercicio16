package br.com.etechoracio.exercicio16;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "TBL_EDITORA")
@Entity
public class Editora {
	
	@Column(name="ID_EDITORA")
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Column(name="TX_EMAIL")
	private String email;
		
}
