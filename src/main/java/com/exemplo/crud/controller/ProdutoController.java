package com.exemplo.crud.controller;

import com.exemplo.crud.entity.Produto;
import com.exemplo.crud.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin(origins = "*") // Permite CORS para todas as origens
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // GET /api/produtos - Listar todos os produtos
    @GetMapping
    public ResponseEntity<List<Produto>> listarTodos() {
        List<Produto> produtos = produtoService.listarTodos();
        return ResponseEntity.ok(produtos);
    }

    // GET /api/produtos/{id} - Buscar produto por ID
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        Optional<Produto> produto = produtoService.buscarPorId(id);

        if (produto.isPresent()) {
            return ResponseEntity.ok(produto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST /api/produtos - Criar novo produto
    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto) {
        try {
            Produto novoProduto = produtoService.salvar(produto);
            return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    // PUT /api/produtos/{id} - Atualizar produto
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        Produto produtoAtualizado = produtoService.atualizar(id, produto);

        if (produtoAtualizado != null) {
            return ResponseEntity.ok(produtoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE /api/produtos/{id} - Deletar produto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deletado = produtoService.deletar(id);

        if (deletado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // GET /api/produtos/buscar?nome={nome} - Buscar produtos por nome
    @GetMapping("/buscar")
    public ResponseEntity<List<Produto>> buscarPorNome(@RequestParam String nome) {
        List<Produto> produtos = produtoService.buscarPorNome(nome);
        return ResponseEntity.ok(produtos);
    }

    // GET /api/produtos/preco?min={min}&max={max} - Buscar produtos por faixa de preço
    @GetMapping("/preco")
    public ResponseEntity<List<Produto>> buscarPorFaixaPreco(
            @RequestParam BigDecimal min,
            @RequestParam BigDecimal max) {
        List<Produto> produtos = produtoService.buscarPorFaixaPreco(min, max);
        return ResponseEntity.ok(produtos);
    }
}
