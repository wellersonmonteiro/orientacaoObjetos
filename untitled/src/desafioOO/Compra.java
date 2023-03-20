package desafioOO;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item>  itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade){
        this.itens.add((new Item(p,quantidade)));
    }

    void adicionarItem(String nome, double preco, int qtde){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item( produto , qtde));
    }
    double obterValortotal(){
        double total = 0;

        for (Item item: itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
