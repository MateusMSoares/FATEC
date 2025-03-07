package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel {
    private ItemCompra[] itens;
    private int qtdMax;

    public ListaCompra(int qtdMax) {
        this.qtdMax = qtdMax;
        this.itens = new ItemCompra[qtdMax];
    }

    public void adicionarItem(ItemCompra item) {
        for (int i = 0; i < qtdMax; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                break;
            }
        }
    }

    public Double calcularPreco() {
        Double total = 0.0;
        for (int i = 0; i < qtdMax; i++) {
            if (itens[i] != null) {
                total += itens[i].calcularPreco();
            }
        }
        return total;
    }
}
