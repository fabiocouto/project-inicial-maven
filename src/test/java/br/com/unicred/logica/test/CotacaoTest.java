package br.com.unicred.logica.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import br.com.unicred.logica.Cotacao;
import br.com.unicred.logica.ItemCotacao;

public class CotacaoTest {

	private Cotacao cotacao;
	
	@Before
	public void inicializar() {
		cotacao = new Cotacao();
	}
	
	@Test
	public void cotacaoSemItensDeveTerTotalZerado() {
		assertTrue(0 == cotacao.getValorTotal());
	}
	
	@Test 
	public void cotacaoComItensDeveTerTotalIgualSomatorioItens() {
		cotacao.adicionarItem(new ItemCotacao(cotacao, "Cerveja", 3, 100));
		cotacao.adicionarItem(new ItemCotacao(cotacao, "Amendoim", 4, 50));
		assertTrue(500 == cotacao.getValorTotal());
	}

	@Test
	public void cotacaoSemItensDeveTerMediaZerada() {
		assertTrue(0 == cotacao.getValorMedio());
	}
	
	@Test
	public void cotacaoComSomenteUmItemDeveTerMediaIgualItem() {
		cotacao.adicionarItem(new ItemCotacao(cotacao, "Cerveja", 3, 100) );
		assertTrue(300 == cotacao.getValorMedio());
	}
	
	@Test
	public void cotacaoComMuitosItensDeveTerMediaSimples() {
		cotacao.adicionarItem(new ItemCotacao(cotacao, "Cerveja", 3, 100) );
		cotacao.adicionarItem(new ItemCotacao(cotacao, "Amendoim", 4, 50) );
		assertTrue(250 == cotacao.getValorMedio());
	}
}
