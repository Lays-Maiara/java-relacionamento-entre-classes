package composicao;

public class ItemPedido {

	private int qtde;
	private Double valorTotal;
	private Produto produto;

	public ItemPedido(int qtde, Double valorTotal, Produto produto) {
		this.qtde = qtde;
		this.valorTotal = valorTotal;
		this.produto = produto;
		this.valorTotal = calcularValorTotal();
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public int getQtde() {
		return qtde;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}

	private Double calcularValorTotal() {
		return qtde * this.produto.getValor();
	}

}
