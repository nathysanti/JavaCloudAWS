package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{
	private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome,preco,quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList();
		for (Item i: itemList) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		itemList.removeAll(itemParaRemover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0;
		
		
		for (Item item: itemList) {
			valorTotal += item.getPreco() * item.getQuantidade();
		}
		
		return valorTotal;
	}
	public void exibrItens() {
		for (Item item: itemList) {
			System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
		}	
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem("Produto 1", 20.0, 2);
		carrinho.adicionarItem("Produto 2", 50.0, 40);
		carrinho.exibrItens();
		
		System.out.println("Valor Total do Carrinho: " + carrinho.calcularValorTotal());
		
		
	}
}
