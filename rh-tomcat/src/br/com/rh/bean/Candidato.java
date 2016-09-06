package br.com.rh.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Candidato implements Bean {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private Escolaridade escolaridade;
	private int idade;
	private double pretensaoSalarial;
	private SituacaoCandidato situacaoCandidato;
	@ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Emprego> historicoEmpregos = new ArrayList<Emprego>();
	@ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Curso> historicoCursos = new ArrayList<Curso>();
	private String autoAvaliacao;
	
	public Candidato() {

	}
	
	public Candidato(String nome, Escolaridade escolaridade, int idade, double pretensaoSalarial, SituacaoCandidato situacaoCandidato, List<Emprego> historicoEmpregos, List<Curso> historicoCursos, String autoAvaliacao) {
		super();
		this.nome = nome;
		this.escolaridade = escolaridade;
		this.idade = idade;
		this.pretensaoSalarial = pretensaoSalarial;
		this.situacaoCandidato = situacaoCandidato;
		this.historicoEmpregos = historicoEmpregos;
		this.historicoCursos = historicoCursos;
		this.autoAvaliacao = autoAvaliacao;
	}
	
	// Construtor do DAO
	public Candidato(Integer id, String nome, Escolaridade escolaridade, int idade, double pretensaoSalarial, SituacaoCandidato situacaoCandidato) {
		this.id = id;
		this.nome = nome;
		this.escolaridade = escolaridade;
		this.idade = idade;
		this.pretensaoSalarial = pretensaoSalarial;
		this.situacaoCandidato = situacaoCandidato;
	}
	
	public Candidato(String nome, Escolaridade escolaridade, int idade, double pretensaoSalarial, SituacaoCandidato situacaoCandidato, String autoAvaliacao) {
		super();
		this.nome = nome;
		this.escolaridade = escolaridade;
		this.idade = idade;
		this.pretensaoSalarial = pretensaoSalarial;
		this.situacaoCandidato = situacaoCandidato;
		this.autoAvaliacao = autoAvaliacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		if (nome != null)
			return nome;
		return "";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPretensaoSalarial() {
		return pretensaoSalarial;
	}

	public void setPretensaoSalarial(double pretensaoSalarial) {
		this.pretensaoSalarial = pretensaoSalarial;
	}

	public SituacaoCandidato getSituacaoCandidato() {
		return situacaoCandidato;
	}

	public void setSituacaoCandidato(SituacaoCandidato situacaoCandidato) {
		this.situacaoCandidato = situacaoCandidato;
	}

	public List<Emprego> getHistoricoEmpregos() {
		return historicoEmpregos;
	}

	public void setHistoricoEmpregos(List<Emprego> historicoEmpregos) {
		this.historicoEmpregos = historicoEmpregos;
	}

	public List<Curso> getHistoricoCursos() {
		return historicoCursos;
	}

	public void setHistoricoCursos(List<Curso> historicoCursos) {
		this.historicoCursos = historicoCursos;
	}

	public String getAutoAvaliacao() {
		return autoAvaliacao;
	}

	public void setAutoAvaliacao(String autoAvaliacao) {
		this.autoAvaliacao = autoAvaliacao;
	}

}