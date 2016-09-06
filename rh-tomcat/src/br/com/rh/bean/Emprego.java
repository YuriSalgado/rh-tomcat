package br.com.rh.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.com.rh.service.AdaptadorDate;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Emprego implements Bean {

	@Id
	@GeneratedValue
	private Integer id;
	private double remuneracao;
	private String empresa;
	private String cidade;
	private String atividades;
	@XmlJavaTypeAdapter(AdaptadorDate.class)
	private Date admissao;
	@XmlJavaTypeAdapter(AdaptadorDate.class)
	private Date demissao;
	
	public Emprego() {
		
	}

	public Emprego(double remuneracao, String empresa, String cidade, String atividades, Date admissao, Date demissao) {
		super();
		this.remuneracao = remuneracao;
		this.empresa = empresa;
		this.cidade = cidade;
		this.atividades = atividades;
		this.admissao = admissao;
		this.demissao = demissao;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;	
	}

	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getAtividades() {
		return atividades;
	}

	public void setAtividades(String atividades) {
		this.atividades = atividades;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public Date getDemissao() {
		return demissao;
	}

	public void setDemissao(Date demissao) {
		this.demissao = demissao;
	}
	
}
