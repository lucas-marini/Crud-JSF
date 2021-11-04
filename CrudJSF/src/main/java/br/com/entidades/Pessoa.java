package br.com.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
/**
 * The Class Pessoa.
 */
@Entity
public class Pessoa implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/** The nome. */
	private String nome;
	
	/** The sobrenome. */
	private String sobrenome;
	
	/** The idade. */
	private Integer idade;
	
	/** The data nascimento. */
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	/**
	 * Instantiates a new pessoa.
	 */
	public Pessoa() {
		
	}
	
	/**
	 * Instantiates a new pessoa.
	 *
	 * @param id the id
	 */
	public Pessoa(Long id) {
		this.setId(id);
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Gets the sobrenome.
	 *
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	
	/**
	 * Sets the sobrenome.
	 *
	 * @param sobrenome the new sobrenome
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	/**
	 * Gets the idade.
	 *
	 * @return the idade
	 */
	public Integer getIdade() {
		return idade;
	}
	
	/**
	 * Sets the idade.
	 *
	 * @param idade the new idade
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	/**
	 * Gets the data nascimento.
	 *
	 * @return the data nascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	/**
	 * Sets the data nascimento.
	 *
	 * @param dataNascimento the new data nascimento
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}

