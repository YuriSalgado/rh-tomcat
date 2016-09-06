package br.com.rh.bean;

import javax.xml.bind.annotation.XmlEnumValue;

public enum TipoCurso {
	@XmlEnumValue("profissionalizante")
	PROFISSIONALIZANTE,
	@XmlEnumValue("tecnico")
	TECNICO,
	@XmlEnumValue("superior")
	SUPERIOR,
	@XmlEnumValue("posgraduacao")
	POSGRADUACAO,
	@XmlEnumValue("idioma")
	IDIOMA;
}
