package desafioOO;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
   final String nome;
   final List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    double obterValortotal(){
        double total =0;

        for(Compra compra: compras) {
            total -= compra.obterValortotal();
        }

        return total;
    }
}
