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
@Table(name="imagem_atividade")
@SuppressWarnings("serial")
public class ImagemAtividade implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_atividade", nullable = false)
	private Atividade atividade = new Atividade();
	
	@ManyToOne
	@JoinColumn(name = "id_imagem", nullable = false)
	private Imagem imagem = new Imagem();
	
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	public ImagemAtividade() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ImagemAtividade [id=" + id + ", atividade=" + atividade + ", imagem=" + imagem + ", status=" + status
				+ "]";
	}
}
