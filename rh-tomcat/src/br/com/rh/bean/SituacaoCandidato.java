package br.com.rh.bean;

import javax.xml.bind.annotation.XmlEnumValue;

public enum SituacaoCandidato {
	@XmlEnumValue("empregado")
	EMPREGADO,
	@XmlEnumValue("desempregado")
	DESEMPREGADO;
}
