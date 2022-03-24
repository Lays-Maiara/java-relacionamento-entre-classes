package composicao;

public class Principal {

	public static void main(String[] args) {

		Produto prod1 = new Produto("Laranja", 0.50);
		Produto prod2 = new Produto("Maçã", 0.65);

		ItemPedido item1 = new ItemPedido(3, null, prod1);
		ItemPedido item2 = new ItemPedido(5, null, prod2);

		Pedido pedido = new Pedido("Lays Maiara Assunção Alves");
		pedido.getItens()[0] = item1;
		pedido.getItens()[1] = item2;

		System.out.println("Cliente: " + pedido.getCliente());
		for (ItemPedido item : pedido.getItens()) {
			System.out.println("Produto: " + item.getProduto().getNome());
			System.out.println("Qtde: " + item.getQtde());
			System.out.println("Valor Total: R$" + item.getValorTotal());
			System.out.println("-----------------------------------");
		}
	}
}
