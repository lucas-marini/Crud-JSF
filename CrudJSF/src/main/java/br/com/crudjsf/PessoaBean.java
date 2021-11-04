package br.com.crudjsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dao.DaoGeneric;
import br.com.entidades.Pessoa;

// TODO: Auto-generated Javadoc
/**
 * The Class PessoaBean.
 */
@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean implements Serializable{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The pessoa. */
	private Pessoa pessoa = new Pessoa();
	
	/** The dao generic. */
	private DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
	
	/** The pessoas. */
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	/**
	 * Salvar.
	 *
	 * @return the string
	 */
	public String salvar() {
		pessoa = daoGeneric.merge(pessoa);
		carregarPessoas();
		return "";
	}
	
	/**
	 * Novo.
	 *
	 * @return the string
	 */
	public String novo() {
		pessoa = new Pessoa();
		return "";
	}
	
	/**
	 * Removes the.
	 *
	 * @return the string
	 */
	public String remove() {
		daoGeneric.deletePorId(pessoa);
		pessoa = new Pessoa();
		carregarPessoas();
		return "";
	}
	
	/**
	 * Removes the id.
	 *
	 * @param id the id
	 * @return the string
	 */
	public String removeId(Long id) {
		Pessoa p = new Pessoa(id);
		daoGeneric.deletePorId(p);
		pessoa = new Pessoa();
		carregarPessoas();
		return "";
	}
	

	/**
	 * Carregar pessoas.
	 */
	@PostConstruct
	public void carregarPessoas() {
		pessoas = daoGeneric.getListEntity(Pessoa.class);
	}

	
	/**
	 * Gets the pessoa.
	 *
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * Sets the pessoa.
	 *
	 * @param pessoa the new pessoa
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	/**
	 * Gets the dao generic.
	 *
	 * @return the dao generic
	 */
	public DaoGeneric<Pessoa> getDaoGeneric() {
		return daoGeneric;
	}

	/**
	 * Sets the dao generic.
	 *
	 * @param daoGeneric the new dao generic
	 */
	public void setDaoGeneric(DaoGeneric<Pessoa> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}

	/**
	 * Gets the pessoas.
	 *
	 * @return the pessoas
	 */
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	/**
	 * Sets the pessoas.
	 *
	 * @param pessoas the new pessoas
	 */
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
}

