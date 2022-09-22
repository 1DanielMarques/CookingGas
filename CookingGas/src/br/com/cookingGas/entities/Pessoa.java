package br.com.cookingGas.entities;

import br.com.cookingGas.entities.enums.Ocupacao;

public class Pessoa {
    private String nome;
    private Integer telefone;
    private Ocupacao ocupacao;
    private double valorPagar;
    private Endereco endereco;

    public Pessoa() {

    }

    public Pessoa(String nome, Integer telefone, Ocupacao ocupacao, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.ocupacao = ocupacao;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Ocupacao getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(Ocupacao ocupacao) {
        this.ocupacao = ocupacao;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "[NOME] > " + nome
                + "\n[ENDERECO]" + endereco
                + "\n[CEL] > " + telefone
                + "\n[OCUPACAO] > " + ocupacao
                + "\n[DEVENDO] > R$" + String.format("%.2f", valorPagar);
    }
}
