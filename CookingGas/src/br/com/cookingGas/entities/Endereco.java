package br.com.cookingGas.entities;

public class Endereco {
    String bairro;
    String rua;
    Integer numeroCasa;

    public Endereco() {

    }

    public Endereco(String bairro, String rua, Integer numeroCasa) {
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "Bairro: " + bairro
                + " | Rua: " + rua
                + " | Numero: " + numeroCasa;
    }
}
