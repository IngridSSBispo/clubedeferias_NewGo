package main;
import main.dominio.Socio;
import main.model.CadastroDAO;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String MENU = "Menu ";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        boolean aux = true;
        int opcao = 0;

        while (aux) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println(MENU);
            System.out.println("-----------------------------------------------------------------");

            System.out.println("1. Cadastrar novo sócio");
            System.out.println("2. Consultar sócio");
            System.out.println("3. Atualizar cadastro do sócio");
            System.out.println("4.Excluir cadastro do sócio");
            System.out.println("0. Sair");

            System.out.print("Digite a opção: ");

            opcao = scanner.nextInt();


            switch (opcao) {

                case 0:
                    System.out.printf("Saindo");
                    aux = false;
                    break;

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
                    atualiza();
                    break;
                case 4:
                    System.out.println("Excluir cadastro");
                    apaga();
                    break;

                default:
                    System.out.println("---------------------------------");
                    System.out.println("Opção inválida");
                    System.out.println("---------------------------------");

                    break;


            }
        }
    }

    public static void cadastro() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do sócio: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do sócio: ");
        String numeroCPF = scanner.next();
        System.out.print("Digite o RG do sócio:  ");
        String RG = scanner.next();
        Socio novoSocio = new Socio(nome, numeroCPF, RG);
        CadastroDAO cadastroDAO = new CadastroDAO();
        cadastroDAO.create(novoSocio);


    }

    public static void consulta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome ou documento do sócio: ");
        String pesquisa = scanner.next();
        CadastroDAO cadastroDAO = new CadastroDAO();
        cadastroDAO.findByInfo(pesquisa, "cpf");
        cadastroDAO.findByInfo(pesquisa, "RG");
        cadastroDAO.findByInfo(pesquisa, "nome");


    }

    public static void atualiza() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da carteirinha: ");
        int numeroCarteirinha = scanner.nextInt();
        scanner.nextLine();
        //mostrar o sócio que será atualizado aqui
        CadastroDAO dao = new CadastroDAO();
        String nr = String.valueOf(numeroCarteirinha);





        boolean resultado = dao.findByInfo(nr, "carteirinha");
        if (resultado) {

            System.out.print("\nDigite o novo nome do sócio: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o novo CPF do sócio: ");
            String numeroCPF = scanner.nextLine();
            System.out.print("Digite o novo RG do sócio: ");
            String RG = scanner.nextLine();
            CadastroDAO cadastroDAO = new CadastroDAO();

            Socio socio = new Socio(nome,numeroCPF,RG);

            cadastroDAO.atualizaByNrCard(
                    numeroCarteirinha,
                   socio
                );

        }

    }

    public static void apaga() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da carteirinha: ");
        int numeroCarteirinha = scanner.nextInt();
        CadastroDAO cadastroDAO = new CadastroDAO();
        cadastroDAO.deleteByNrCard(numeroCarteirinha);


    }
}