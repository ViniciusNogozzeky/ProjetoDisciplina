package br.pucpr.lojadepecas.produto.entity;

import br.pucpr.lojadepecas.veiculo.VeiculoTo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "INFO", nullable = false, unique = true)
    private String informacao;

    @Column(name = "PREÇO", nullable = false, unique = true)
    private Double preco;


    @Transient
    private VeiculoTo veiculoTo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public VeiculoTo getVeiculoTo() {
        return veiculoTo;
    }

    public void setVeiculoTo(VeiculoTo veiculoTo) {
        this.veiculoTo = veiculoTo;
    }
}
