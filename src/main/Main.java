package main;

import main.dominio.Socio;
import main.model.CadastroDAO;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Menu: ");
        System.out.println("1. Cadastrar novo sócio");
        System.out.println("2. Consultar sócio");
        System.out.println("3. Atualizar cadastro do sócio");
        System.out.println("4.Excluir cadastro do sócio");
        System.out.println("5. Sair");

        System.out.print("Digite a opção: ");

        opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("Cadastrando...");
                cadastro();
                break;
            case 2:
                System.out.println("Consultando...");
                consulta();
                break;
            case 3:
                System.out.println("Atualização");
                break;
            case 4:
                System.out.println("Exclusão");
                break;

            default:
                System.out.println("Sair");

        }

    }

    public static void cadastro() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do sócio: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do sócio: ");
        String numeroCPF = scanner.next();
        Socio novoSocio = new Socio(nome, numeroCPF);
        CadastroDAO cadastroDAO = new CadastroDAO();
        cadastroDAO.create(novoSocio);


    }

    public static void consulta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF do sócio:");
        String numeroCPF = scanner.next();
        CadastroDAO cadastroDAO = new CadastroDAO();
        cadastroDAO.readByCPF("C:\\Users\\Ingrid Bispo\\Desktop\\", "arquivo.txt", numeroCPF);


    }

}