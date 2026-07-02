package br.com.kentec.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="atividade")
@SuppressWarnings("serial")
public class Atividade implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="nome", nullable = true, length = 64)
	private String nome;
	
	@Column(name="descricao", nullable = true, length = 256)
	private String descricao;
	
	@Column(name="idade_minima", nullable = true, length = 2)
	private Integer idadeMinima;
	
	@Column(name="idade_maxima", nullable = true, length = 2)
	private Integer idadeMaxima;
	
	@Column(name="url", nullable = true, length = 64)
	private String url;
	
	@Column(name="uri", nullable = true, length = 16)
	private String uri;
	
	@ManyToOne
	@JoinColumn(name = "id_modalidade", nullable = false)
	private Modalidade modalidade = new Modalidade();
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_atividade", nullable = false)
	private TipoAtividade tipoAtividade = new TipoAtividade();
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	public Atividade() {
		
	}

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

	public Integer getIdadeMinima() {
		return idadeMinima;
	}

	public void setIdadeMinima(Integer idadeMinima) {
		this.idadeMinima = idadeMinima;
	}

	public Integer getIdadeMaxima() {
		return idadeMaxima;
	}

	public void setIdadeMaxima(Integer idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public TipoAtividade getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Atividade [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", idadeMinima=" + idadeMinima
				+ ", idadeMaxima=" + idadeMaxima + ", url=" + url + ", uri=" + uri + ", modalidade=" + modalidade
				+ ", tipoAtividade=" + tipoAtividade + ", status=" + status + "]";
	}
}
