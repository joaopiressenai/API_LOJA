package com.loja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loja/produtos")
public class ProdutoController {
    private TabelaProdutos tabelaProdutos;

    public ProdutoController() {
        this.tabelaProdutos = new TabelaProdutos();
    }

    @GetMapping
    public List<Produto> buscarTodosProdutosLoja() {
        return this.tabelaProdutos.buscarTodosProdutos();
    }

    @GetMapping("/{produtoId}")
    public Produto buscarProdutoPeloIdNaLoja (@PathVariable int produtoId) {
        return this.tabelaProdutos.buscarProdutoPeloId(produtoId);
    }

    @PostMapping
    public Produto cadastrarNovoProdutoNaLoja (@RequestBody Produto dadosNovoProduto) {
        return this.tabelaProdutos.cadastrarNovoProduto(dadosNovoProduto);
    }

    @PutMapping("/{produtoId}")
    public void atualizarProdutoNaLoja (@PathVariable int produtoId, @RequestBody Produto dadosAtualizarProduto) {
        this.tabelaProdutos.atualizarProduto(produtoId, dadosAtualizarProduto);
    }

    @DeleteMapping("/{produtoId}")
    public void removerProdutoNaLoja (@PathVariable int produtoId) {
        this.tabelaProdutos.removerProduto(produtoId);
    }
}
