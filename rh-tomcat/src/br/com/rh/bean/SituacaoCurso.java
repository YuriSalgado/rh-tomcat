package br.com.rh.bean;

import javax.xml.bind.annotation.XmlEnumValue;

public enum SituacaoCurso {
	@XmlEnumValue("concluido")
	CONCLUIDO,
	@XmlEnumValue("cursando")
	CURSANDO,
	@XmlEnumValue("desistiu")
	DESISTIU;
}
