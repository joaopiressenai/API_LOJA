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

    /**
     * Método que busca um produto pelo seu ID
     * Caso não encontre retorna null
     * @param produtoId
     * @return
     */
    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p: this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }


    /**
     * Método que cadastrar um novo produto
     * Primeiro busca o último item na lista
     * Depois incrementa o ID
     * Atribui o novo ID ao produito
     * @param novoProduto
     * @return
     */
    public Produto cadastrarNovoProduto(Produto novoProduto) {
        int ultimoIndex = this.produtos.size() - 1;
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        int proximoId = ultimoProduto.getId() + 1;

        novoProduto.setId(proximoId);
        this.produtos.add(novoProduto);
        return novoProduto;
    }

    /**
     * Método que atualiza um produto
     * Primeiro busca o produto atualizado pelo id
     * Depois atribui as novas informações: nome, descrição e valor
     * Finalmente salva o produto atualizado
     * @param produtoId
     * @param produtoAtualizar
     */
    public void atualizarProduto(int produtoId, Produto produtoAtualizar) {
        Produto produtoProcurado = this.buscarProdutoPeloId(produtoId);
        if (produtoProcurado != null) {
            produtoProcurado.setNome(produtoAtualizar.getNome());
            produtoProcurado.setDescricao(produtoAtualizar.getDescricao());
            produtoProcurado.setValorUnitario(produtoAtualizar.getValorUnitario());
        }
    }

    /**
     * Método que remove um produto da lista
     * Utiliza como base o próprio objeto para remover
     * @param produtoId
     */
    public void removerProduto(int produtoId) {
        Produto produtoRemover = this.buscarProdutoPeloId(produtoId);
        this.produtos.remove(produtoRemover);
    }
}
