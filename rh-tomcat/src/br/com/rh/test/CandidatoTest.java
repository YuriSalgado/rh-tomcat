package br.com.rh.test;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.rh.bean.Candidato;
import br.com.rh.bean.Curso;
import br.com.rh.bean.Emprego;
import br.com.rh.bean.Escolaridade;
import br.com.rh.bean.SituacaoCandidato;
import br.com.rh.bean.SituacaoCurso;
import br.com.rh.bean.TipoCurso;
import br.com.rh.dao.CandidatoDao;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CandidatoTest {

	@Test
	public void testA_salvar() {
		CandidatoDao candidatoDao = new CandidatoDao();
		
		Date admissao = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 2);
		Date demissao = new Date();
		Emprego e = new Emprego(3100, "SETI Tecnologia", "Jaraguá do Sul", "Analise e Desenvolvimento", admissao, demissao);
		
		Curso c = new Curso(1200, TipoCurso.SUPERIOR, "Católica SC", "Jaraguá do Sul/SC", SituacaoCurso.CONCLUIDO);
		
		Candidato candidato = new Candidato("Yuri Salgado", Escolaridade.ENSINOSUPERIOR, 22, 3600, SituacaoCandidato.EMPREGADO, "Pró-ativo, conciliador, confiante");
		
		candidato.getHistoricoEmpregos().add(e);
		candidato.getHistoricoCursos().add(c);
		
		candidatoDao.openTansaction();
		candidatoDao.save(candidato);
		candidatoDao.commit();
		
		Assert.assertNotNull(candidato.getId());
	}
	
	@Test
	public void testB_buscarPorId() {
		CandidatoDao candidatoDao = new CandidatoDao();
		Assert.assertNotNull(candidatoDao.findById(1));
	}
	
	@Test
	public void testC_buscarPorNome() {
		CandidatoDao candidatoDao = new CandidatoDao();
		Assert.assertNotNull(candidatoDao.findByNome("Yuri Salgado"));
	}
	
	@Test
	public void testD_buscarTodos() {
		CandidatoDao candidatoDao = new CandidatoDao();
		for (Candidato c : candidatoDao.listCandidatos()) {
			System.out.println(c.getNome());
		}
		Assert.assertNotNull(candidatoDao.listCandidatos());
	}
	
	@Test
	public void testE_excluir() {
		CandidatoDao candidatoDao = new CandidatoDao();
		candidatoDao.openTansaction();
		candidatoDao.remove(candidatoDao.findById(1));
		Assert.assertNull(candidatoDao.findById(1));
		candidatoDao.rollback();
	}
}