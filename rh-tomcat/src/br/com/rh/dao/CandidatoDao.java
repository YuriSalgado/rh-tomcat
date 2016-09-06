package br.com.rh.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.rh.bean.Candidato;

public class CandidatoDao extends JpaDaoBase<Candidato>{
	
	//Especificas para o objeto Candidato
	public Candidato findByNome(String nome) {
		Candidato candidato = null;
		if (nome == null || nome.equals("")) {
			return candidato;
		} else {
			Query query = em.createQuery("SELECT u FROM Candidato u WHERE nome = :nome");
			query.setParameter("nome", nome);
			
			if (query.getResultList().size() > 0) {
				candidato = (Candidato) query.getSingleResult();
			}
		}
		return candidato;
	}

	public List<Candidato> listCandidatos() {
		Query query = em.createQuery("SELECT NEW Candidato(u.id, u.nome, u.escolaridade, u.idade, u.pretensaoSalarial, u.situacaoCandidato) FROM Candidato u");
		return query.getResultList();
	}
}