package br.pucpr.lojadepecas.produto.repository;

import br.pucpr.lojadepecas.produto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
}
