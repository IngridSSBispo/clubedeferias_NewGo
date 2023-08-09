package main.model;
import main.dominio.Socio;
import main.io.Arquivo;
import java.io.*;
import java.util.ArrayList;

public class CadastroDAO implements InterfaceDAO {

    @Override
    public void create(Socio socio) throws IOException {
        System.out.println("nome: " + socio.getNome());
        System.out.println("CPF: " + socio.getNumeroCPF());
        System.out.println("Nº da carteirinha: " + socio.getNumeroCarteirinha());

        System.out.println("Cadastro realizado com sucesso!");


        //escrever o arquivo de texto

        Arquivo arquivo = new Arquivo();
        String content = "";
        content = "Nome: " + socio.getNome() + " | CPF: " + socio.getNumeroCPF() + " | Nª carteirinha: " + socio.getNumeroCarteirinha();
        arquivo.create("C:\\Users\\Ingrid Bispo\\Desktop\\arquivo.txt", content);


    }

    @Override
    public void read(String path, String name) {
        System.out.println("Iniciando leitura!");

        Arquivo arquivo = new Arquivo();
        arquivo.read(path, name);

        System.out.println("leitura feita com sucesso!");

    }


    public void readByCPF(String path, String name, String numeroCPF) {
        Arquivo arquivo = new Arquivo();
        String conteudo = arquivo.read(path, name);

        //Para separar as linhas do arquivo com ";"
        String[] textoSeparado = conteudo.split(";");
        String socio = "";

        for (String linha : textoSeparado) {
            if (linha.contains(numeroCPF)) {
                socio = linha;
            }
        }

        if (socio != "") {
            System.out.print("Sócio encontrado: " + socio);
        } else {
            System.out.println("Sócio não encontrado");
        }

    }

    public void deleteByNrCard(int numeroCarteirinha, String path, String file) throws IOException {
        Arquivo arquivo = new Arquivo();
        String conteudo = arquivo.read(path, file);

        String[] textoSeparado = conteudo.split(";");
        ArrayList<String> newContentFile = new ArrayList<String>();

        String nrCart = String.valueOf(numeroCarteirinha);

        for (String line : textoSeparado) {
            if (!line.contains(nrCart)) {
                newContentFile.add(line);
            }
        }


        System.out.println(newContentFile);

        //limpar arquivo

        arquivo.delete(path, file);

        for (String line : newContentFile) {
            arquivo.create(path + file, line);
        }

    }

    /*public void clearFile(String path, String file) throws IOException {
        Arquivo arquivo = new Arquivo();

        PrintWriter writer = new PrintWriter(new FileWriter(path + file));
        writer.print("");
        writer.close();

    }*/

    public void atualizaByNrCard(int numeroCarteirinha, String path, String file, String nmSocio,String cpfSocio) throws IOException {
        Arquivo arquivo = new Arquivo();
        String conteudo = arquivo.read(path, file);

        String[] textoSeparado = conteudo.split(";");

        ArrayList<String> newContentFile = new ArrayList<String>();

        String nrCart = String.valueOf(numeroCarteirinha);

        for (String linha : textoSeparado) {
            if (linha.contains(nrCart)) {
                // Atualizar os dados do sócio na linha correspondente
                String novoConteudo = "Nome: " + nmSocio + " | CPF: " + cpfSocio + "| Nª carteirinha: " + numeroCarteirinha;

                newContentFile.add(novoConteudo);
            } else {
                newContentFile.add(linha);
            }
        }

        // Limpar e reescrever o arquivo
        arquivo.delete(path, file);

        for (String line : newContentFile) {
            arquivo.create(path + file, line);
        }

        System.out.println("Sócio atualizado com sucesso!");
    }


    @Override
    public void update(int numeroCarteirinha) {



    }


    @Override
    public void delete(int numeroCarteirinha) {


    }

}


