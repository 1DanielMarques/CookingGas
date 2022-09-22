package br.com.cookingGas.entities;

import br.com.cookingGas.entities.enums.Ocupacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String telefone;
    private Ocupacao ocupacao;
    private double valorPagar;
    private Endereco endereco;
    private LocalDate dataCadastro;
    private LocalDate dataPagamento;

    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM");

    public Pessoa() {

    }

    public Pessoa(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataCadastro() {
        return dataCadastro.format(fmt);
    }

    public String getDataPagamento() {
        return dataPagamento.format(fmt2);
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = LocalDate.parse(dataPagamento,fmt);
    }

    @Override
    public String toString() {
        return  "[DATA CADASTRO] > " + this.getDataCadastro()
                + "\n[NOME] > " + nome
                + "\n[ENDERECO] > " + endereco.toString()
                + "\n[CEL] > " + telefone
                + "\n[OCUPACAO] > " + ocupacao
                + "\n[DEVENDO] > R$" + String.format("%.2f", valorPagar)
                + "\n[DATA PAGAMENTO] > " +this.getDataPagamento();
    }
}
