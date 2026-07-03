package br.com.kentec.psychopower.domain;

import java.io.Serializable;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="imagem")
@SuppressWarnings("serial")
public class Imagem implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="nome", nullable = true, length = 64)
	private String nome;
	
	@Column(name="descricao", nullable = true, length = 64)
	private String descricao;
	
	@Lob
	@Column(name = "foto", columnDefinition = "LONGBLOB")
	private byte[] foto;
	
	@Lob
	@Column(name = "som", columnDefinition = "LONGBLOB")
	private byte[] som;
	
	@ManyToOne
	@JoinColumn(name = "id_modalidade", nullable = false)
	private Modalidade modalidade = new Modalidade();
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	public Imagem() {
		
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

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public byte[] getSom() {
		return som;
	}

	public void setSom(byte[] som) {
		this.som = som;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ImagemAtividade [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", foto="
				+ Arrays.toString(foto) + ", som=" + Arrays.toString(som) + ", modalidade=" + modalidade + ", status="
				+ status + "]";
	}
}
