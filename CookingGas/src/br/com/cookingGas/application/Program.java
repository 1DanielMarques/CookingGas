package br.com.cookingGas.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            opcao = 0;
            System.out.println("1 - Registrar Cliente");
            System.out.println("2 - Dados Cliente");
            System.out.println("3 - Alterar dados Cliente");
            System.out.println("4 - Deletar Cliente");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Registrar");

                    break;
                case 2:
                    System.out.println("Dados");
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
