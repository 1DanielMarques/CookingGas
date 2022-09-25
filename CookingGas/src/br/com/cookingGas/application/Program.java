package br.com.cookingGas.application;

import br.com.cookingGas.entities.Endereco;
import br.com.cookingGas.entities.Pessoa;
import br.com.cookingGas.entities.enums.Ocupacao;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Endereco endereco = new Endereco();
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
                    insereDados(p, endereco);
                    break;
                case 2:
                    System.out.println("Dados");
                    System.out.println(p);
                    break;
                case 3:
                    System.out.println("Alterar");
                    System.out.println("1 - Alterar todos os dados");
                    System.out.println("2 - Alterar dados específicos");
                    int opcaoAlt = sc.nextInt();
                    switch (opcaoAlt) {
                        case 1:
                            insereDados(p, endereco);
                            break;
                        case 2:
                            int opcaoDados = 0;
                            do {
                                System.out.println("1 - Nome");
                                System.out.println("2 - Telefone");
                                System.out.println("3 - Bairro");
                                System.out.println("4 - Rua");
                                System.out.println("5 - Numero casa");
                                System.out.println("6 - Ocupação");
                                System.out.println("7 - Valor a pagar");
                                System.out.println("8 - Data pagamento");
                                System.out.println("9 - Finalizar");
                                opcaoDados = sc.nextInt();
                                dadosEspecificos(p, endereco, opcaoDados);
                            } while (opcaoDados != 9);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Deletar");
                    p = null;
                    break;
                case 9:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
    }

    public static void insereDados(Pessoa p, Endereco endereco) {
        System.out.print("[NOME] > ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("[TELEFONE] > ");
        String tel = sc.next();
        System.out.println("-ENDEREÇO-");
        System.out.print("[BAIRRO] > ");
        sc.nextLine();
        String bairro = sc.nextLine();
        System.out.print("[RUA] > ");
        String rua = sc.nextLine();
        System.out.print("[NUMERO CASA] > ");
        int numeroCasa = sc.nextInt();
        setOcupacao(p);
        endereco.setBairro(bairro);
        endereco.setRua(rua);
        endereco.setNumeroCasa(numeroCasa);
        p.setNome(nome);
        p.setTelefone(tel);
        p.setEndereco(endereco);

        System.out.print("[DEVENDO] > R$");
        double valorPagar = sc.nextDouble();
        p.setValorPagar(valorPagar);
        dataReceber(p);
        p.setDataCadastro(LocalDate.now());
    }

    public static void dataReceber(Pessoa p) {
        System.out.print("[DATA RECEBER] (DD/MM) > ");
        String dataPagamento = sc.next();
        dataPagamento = dataPagamento + "/" + LocalDate.now().getYear();
        p.setDataPagamento(dataPagamento);
    }

    public static void setOcupacao(Pessoa p) {
        System.out.println("-OCUPAÇÃO-");
        System.out.println("1 - Empregado");
        System.out.println("2 - Aposentado");
        System.out.println("3 - Comércio");
        System.out.println("4 - Desempregado");
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
            case 4:
                p.setOcupacao(Ocupacao.DESEMPREGADO);
                break;
        }
    }


    public static void dadosEspecificos(Pessoa p, Endereco endereco, int opcao) {
        switch (opcao) {
            case 1:
                System.out.print("[NOME] > ");
                sc.nextLine();
                p.setNome(sc.nextLine());
                break;
            case 2:
                System.out.print("[TELEFONE] > ");
                p.setTelefone(sc.next());
                break;
            case 3:
                System.out.print("[BAIRRO] > ");
                sc.nextLine();
                endereco.setBairro(sc.nextLine());
                break;
            case 4:
                System.out.print("[RUA] > ");
                sc.nextLine();
                endereco.setRua(sc.nextLine());
                break;
            case 5:
                System.out.print("[NUMERO CASA] > ");
                endereco.setNumeroCasa(sc.nextInt());
                break;
            case 6:
                setOcupacao(p);
                break;
            case 7:
                System.out.print("[DEVENDO] > R$");
                p.setValorPagar(sc.nextDouble());
                break;
            case 8:
                dataReceber(p);
                break;
        }
    }
}
