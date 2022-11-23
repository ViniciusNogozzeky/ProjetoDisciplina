package br.pucpr.lojadepecas.usuario.repository;

import br.pucpr.lojadepecas.usuario.entity.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
