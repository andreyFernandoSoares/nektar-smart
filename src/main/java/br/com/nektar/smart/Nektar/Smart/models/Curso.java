package br.com.nektar.smart.Nektar.Smart.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String descricao;
	private String explicacao;
	private String imagem;
	private Integer ordem;
	private String pacote;
	
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
	public String getExplicacao() {
		return explicacao;
	}
	public void setExplicacao(String explicacao) {
		this.explicacao = explicacao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public Integer getOrdem() {
		return ordem;
	}
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	public String getPacote() {
		return pacote;
	}
	public void setPacote(String pacote) {
		this.pacote = pacote;
	}
	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", explicacao=" + explicacao
				+ ", imagem=" + imagem + ", ordem=" + ordem + ", pacote=" + pacote + "]";
	}
}
