package br.com.rh.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Curso implements Bean {

	@Id
	@GeneratedValue
	private Integer id;
	private int cargaHoraria;
	private TipoCurso tipoCurso;
	private String instituicao;
	private String local;
	private SituacaoCurso situacaoCurso;
	
	public Curso() {
		
	}
	
	public Curso(int cargaHoraria, TipoCurso tipoCurso, String instituicao, String local, SituacaoCurso situacaoCurso) {
		super();
		this.cargaHoraria = cargaHoraria;
		this.tipoCurso = tipoCurso;
		this.instituicao = instituicao;
		this.local = local;
		this.situacaoCurso = situacaoCurso;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;	
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public TipoCurso getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(TipoCurso tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public SituacaoCurso getSituacaoCurso() {
		return situacaoCurso;
	}

	public void setSituacaoCurso(SituacaoCurso situacaoCurso) {
		this.situacaoCurso = situacaoCurso;
	}
	
}
