package br.com.unicred.logica;

public class ItemCotacao {

	private Cotacao cotacao;
	private String produto;
	private int quantidade;
	private double valor;

	public ItemCotacao(Cotacao cotacao, String produto, int quantidade, double valor) {
		this.cotacao = cotacao;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public ItemCotacao(String produto, int quantidade, double valor) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValorTotal() {
		 
		return getQuantidade() * getValor();
	}
	
	public SituacaoItem getSituacao() {

		if( getValorTotal() == cotacao.getValorMedio()) {
			return SituacaoItem.NA_MEDIA;
		} else if (getValorTotal() > cotacao.getValorMedio()) {
			return SituacaoItem.ACIMA_MEDIA;
		} else 
			return SituacaoItem.ABAIXO_MEDIA;
	}
}
