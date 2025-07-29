package com.exemplo.crud.repository;

import com.exemplo.crud.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Método personalizado para buscar produtos por nome (case insensitive)
    List<Produto> findByNomeContainingIgnoreCase(String nome);

    // Método personalizado para buscar produtos por faixa de preço
    List<Produto> findByPrecoBetween(java.math.BigDecimal precoMin, java.math.BigDecimal precoMax);
}