package br.com.unicred.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.unicred.logica.Cotacao;
import br.com.unicred.logica.ItemCotacao;
import br.com.unicred.logica.SituacaoItem;

public class ItemCotacaoTest {
	
	
	private Cotacao cotacao;
	
	@Before
	public void inicializar() {
		cotacao = new Cotacao();
		cotacao.adicionarItem(new ItemCotacao(cotacao,"Cerveja", 1, 300));
		cotacao.adicionarItem(new ItemCotacao(cotacao, "Amendoim", 1, 200));
		cotacao.adicionarItem(new ItemCotacao(cotacao, "Agua", 1, 100));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void totalDoItemDeveSerCalculadoPorQtdeVsValor() {
		
		ItemCotacao item = new ItemCotacao(cotacao, "Cerveja", 6, 75.d);
		assertTrue(450 == item.getValorTotal());
	}
	
	@Test
	public void itemComValorAcimaDaMedia() {
		ItemCotacao itemCerveja = cotacao.getItens().get(0);
		assertTrue(SituacaoItem.ACIMA_MEDIA == itemCerveja.getSituacao());
	}
	
	@Test
	public void itemComValorNaMedia() {
		ItemCotacao itemAmendoin = cotacao.getItens().get(1);
		assertTrue(SituacaoItem.NA_MEDIA == itemAmendoin.getSituacao());	
	}
	
	@Test
	public void itemComValorAbaixoDaMedia() {
		ItemCotacao itemAgua = cotacao.getItens().get(2);
		assertTrue(SituacaoItem.ABAIXO_MEDIA == itemAgua.getSituacao());
	}
	
}
