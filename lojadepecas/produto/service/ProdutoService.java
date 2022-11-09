package br.pucpr.lojadepecas.produto.service;

import br.pucpr.lojadepecas.produto.entity.Produto;
import br.pucpr.lojadepecas.produto.repository.ProdutoRepository;
import br.pucpr.lojadepecas.util.excecao.ExcecaoExemplo;
import br.pucpr.lojadepecas.veiculo.FeignVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private FeignVeiculo feignVeiculo;

    public Produto salvar(Produto produto) throws ExcecaoExemplo {
        if (produto.getNome() == null ||
                produto.getNome().equals("") ||
                produto.getNome().length() > 300) {
            //lanco um erro
            throw new ExcecaoExemplo("ERR001","O dados dos usuário estão errados manow.");
        }

        return produtoRepository.save(produto);
    }

    public List<Produto> listar() {
        List<Produto> produtos = produtoRepository.findAll();
        /*for (Usuario u : usuarios) {
            VeiculoTo veiculo = feignVeiculo.buscarPorGuidUsuario(u.getId());

            u.setVeiculoTo(veiculo);
        }*/
        return produtos;
    }

    public Produto buscarPorId(Integer id) {
        return produtoRepository.findById(id).get();
    }

    public void excluir(Integer id) {
        produtoRepository.deleteById(id);
    }

}
