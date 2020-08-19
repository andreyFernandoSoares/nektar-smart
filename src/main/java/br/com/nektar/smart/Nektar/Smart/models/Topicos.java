package br.com.nektar.smart.Nektar.Smart.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Topicos {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String descricao;
	
	@OneToMany
	private List<ImagemCodigo> listaImgCode;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<ImagemCodigo> getListaImgCode() {
		return listaImgCode;
	}

	public void setListaImgCode(List<ImagemCodigo> listaImgCode) {
		this.listaImgCode = listaImgCode;
	} 
}
