package br.com.unicred.logica;

import java.util.ArrayList;
import java.util.List;

public class Cotacao {

	// atributos
	private List<ItemCotacao> itens;

	public Cotacao() {
		itens = new ArrayList<ItemCotacao>();
	}

	public void adicionarItem(ItemCotacao itemCotacao) {
		this.itens.add(itemCotacao);
	}

	public double getValorTotal() {
		double soma = 0;
		for (ItemCotacao itemCotacao : itens) {
			soma += itemCotacao.getValorTotal();
		}
		return soma;
	}

	public double getValorMedio() {
		if (itens.size() == 0) {
			return 0;
		}
		return getValorTotal() / itens.size();
	}

	public List<ItemCotacao> getItens() {
		return this.itens;
	}
}
