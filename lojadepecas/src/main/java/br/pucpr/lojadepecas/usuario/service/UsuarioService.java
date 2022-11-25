package br.pucpr.lojadepecas.usuario.service;

import br.pucpr.lojadepecas.usuario.entity.Usuario;
import br.pucpr.lojadepecas.usuario.repository.UsuarioRepository;
import br.pucpr.lojadepecas.util.excecao.ExcecaoExemplo;
import br.pucpr.lojadepecas.veiculo.FeignVeiculo;
import br.pucpr.lojadepecas.veiculo.VeiculoTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private FeignVeiculo feignVeiculo;

    public Usuario salvar(Usuario usuario) throws ExcecaoExemplo {
        if (usuario.getNome() == null ||
                usuario.getNome().equals("") ||
                usuario.getNome().length() > 300) {
            //lanco um erro
            throw new ExcecaoExemplo("ERR001","O dados dos usuário estão errados manow.");
        }

        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        for (Usuario u : usuarios) {
            VeiculoTo veiculo = feignVeiculo.buscarPorGuidUsuario(u.getId());

            u.setVeiculoTo(veiculo);
        }
        return usuarios;
    }

    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

}
