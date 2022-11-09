package br.pucpr.lojadepecas.usuario.repository;

import br.pucpr.lojadepecas.usuario.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Produto,Integer> {
}
