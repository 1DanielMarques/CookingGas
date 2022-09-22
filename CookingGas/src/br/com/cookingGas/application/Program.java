package br.com.cookingGas.application;

import br.com.cookingGas.entities.Endereco;
import br.com.cookingGas.entities.Pessoa;
import br.com.cookingGas.entities.enums.Ocupacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        String nome;
        String tel;
        String bairro;
        String rua;
        int numeroCasa;

        int opcao = 0;
        do {
            System.out.println();
            System.out.println("1 - Registrar Cliente");
            System.out.println("2 - Dados Cliente");
            System.out.println("3 - Alterar dados Cliente");
            System.out.println("4 - Deletar Cliente");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Registrar");
                    System.out.print("[NOME] > ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.print("[TELEFONE] > ");
                    tel = sc.next();
                    System.out.println("-ENDEREÇO-");
                    System.out.print("[BAIRRO] > ");
                    sc.nextLine();
                    bairro = sc.nextLine();
                    System.out.print("[RUA] > ");
                    rua = sc.nextLine();
                    System.out.print("[NUMERO CASA] > ");
                    numeroCasa = sc.nextInt();
                    Endereco endereco = new Endereco(bairro, rua, numeroCasa);
                    p.setNome(nome);
                    p.setTelefone(tel);
                    p.setEndereco(endereco);
                    System.out.println("-OCUPAÇÃO-");
                    System.out.println("1 - Empregado");
                    System.out.println("2 - Aposentado");
                    System.out.println("3 - Comércio");
                    int ocupacao = sc.nextInt();
                    switch (ocupacao) {
                        case 1:
                            p.setOcupacao(Ocupacao.EMPREGADO);
                            break;
                        case 2:
                            p.setOcupacao(Ocupacao.APOSENTADO);
                            break;
                        case 3:
                            p.setOcupacao(Ocupacao.COMERCIO);
                            break;
                        default:
                            p.setOcupacao(Ocupacao.DESEMPREGADO);
                    }
                    System.out.print("[DEVENDO] > R$");
                    double valorPagar = sc.nextDouble();
                    p.setValorPagar(valorPagar);
                    break;
                case 2:
                    System.out.println("Dados");
                    System.out.println(p.toString());
                    break;
                case 3:
                    System.out.println("Alterar");
                    break;
                case 4:
                    System.out.println("Deletar");
                    break;
                case 9:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }


        } while (opcao != 9);


        sc.close();
    }

}
