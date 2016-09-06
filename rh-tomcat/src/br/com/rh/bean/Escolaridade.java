package br.com.rh.bean;

import javax.xml.bind.annotation.XmlEnumValue;

public enum Escolaridade {
	@XmlEnumValue("ensinofundamental")
	ENSINOFUNDAMENTAL,
	@XmlEnumValue("ensinomedio")
	ENSINOMEDIO,
	@XmlEnumValue("profissionalizante")
	PROFISSIONALIZANTE,
	@XmlEnumValue("tecnico")
	TECNICO,
	@XmlEnumValue("tecnologo")
	TECNOLOGO,
	@XmlEnumValue("ensinosuperior")
	ENSINOSUPERIOR,
	@XmlEnumValue("posgraduacao")
	POSGRADUACAO,
	@XmlEnumValue("mestrado")
	MESTRADO,
	@XmlEnumValue("doutorado")
	DOUTORADO,
	@XmlEnumValue("phd")
	PHD;
}
