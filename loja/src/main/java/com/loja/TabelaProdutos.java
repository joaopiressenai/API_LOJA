package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    /**No construtor a lista de produtos
     * será preenchida
     */
    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta BIC na cor azul", 1.99);
        Produto corretivo = new Produto(2, "Corretivo", "Corretivo comum", 9.99);
        Produto borracha = new Produto(3, "Borracha branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(4, "Lápis Faber Castel", "Lápis Faber Castel comum", 2.99);
        Produto apontador = new Produto(5,"Apontador", "Apontador comum com reservatório", 7.99);
        Produto caderno = new Produto(6,"Caderno espiral", "Caderno espiral de 96 folhas", 15.99);

        this.produtos.add(caneta);
        this.produtos.add(corretivo);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Método que retorna todos os produtos da lista
     */
    public List<Produto> buscarTodosProdutos() {
        return this.getProdutos();
    }
}
