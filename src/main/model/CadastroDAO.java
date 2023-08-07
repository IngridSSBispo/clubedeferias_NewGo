package main.model;

import main.dominio.Socio;
import main.io.Arquivo;

import java.io.IOException;
import java.util.Arrays;

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


    @Override
    public void update(Socio socio) {

    }

    @Override
    public void delete(Socio socio) {


    }
}
