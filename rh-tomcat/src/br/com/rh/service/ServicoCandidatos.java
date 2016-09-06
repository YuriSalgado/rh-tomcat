package br.com.rh.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.rh.bean.Candidato;
import br.com.rh.dao.CandidatoDao;

@WebService
public class ServicoCandidatos {

	public String salvarCandidato(@WebParam(name = "candidato") Candidato candidato) {

		CandidatoDao candidatoDao = new CandidatoDao();
		
		candidatoDao.openTansaction();
		candidatoDao.save(candidato);
		candidatoDao.commit();
		
		return "Salvou!";

	}

	public Candidato pesquisarCandidato(@WebParam(name = "id") Integer id) {

		CandidatoDao candidatoDao = new CandidatoDao();
		return candidatoDao.findById(id);

	}
	
	public Candidato pesquisarCandidatoPorNome(@WebParam(name = "nome") String nome) {

		CandidatoDao candidatoDao = new CandidatoDao();
		return candidatoDao.findByNome(nome);

	}
	
	public List<Candidato> listarCandidatos() {

		CandidatoDao candidatoDao = new CandidatoDao();
		return candidatoDao.listCandidatos();

	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8180/rh/candidatos",
				new ServicoCandidatos());
		System.out.println("Subiu rh!");
	}
}